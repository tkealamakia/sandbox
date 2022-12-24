package com.tsunazumi.algorithms.hackerrank.algorithms.archive;

public class DrawingBook {

  public static void main(String[] args) {
    System.out.println(pageCount(37455,29835));
  }

  static int pageCount(int n, int p) {
    //Front of book
    // if even number of pages, last page is on the left
    // odd number of pages, last page on the right
    int i = 1;
    for (i = 1; i < n; i+=2) {
      if (i >= p) {
        break;
      }
    }
    int front = i/2;

    int back = 0;
    for (int j = n; j > p; j-=2) {
      if (j <= p) {
        break;
      }
      back++;
    }

    if (n % 2 != 0 && p % 2 == 0) {
      back--;
    }

    int answer = front <= back ? front : back;
    if (answer < 0) {
      answer = 0;
    }

    return answer;
  }
}
