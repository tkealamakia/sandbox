package com.tsunazumi.algorithms.hackerrank.interviewprep;

import java.io.*;

public class BeautifulDays {
  public static void main(String[] args) throws IOException {

    int i = 20;
    int j = 23;
    int k = 6;
    int result = beautifulDays(i, j, k);

    System.out.println(result);

  }

  public static int beautifulDays(int i, int j, int k) {
    //iterate the range from i to j
    int days = 0;
    while (i <= j) {
      //reverse the number
      int reversedNum = reverseNumber(i);
      //Find the difference of those two numbers
      int diff = Math.abs(i - reversedNum);
      //divide that number by k
      //if the number is evenly divisible then it's a hit
      if (diff % k == 0) {
        days++;
      }
      i++;
    }
    // return the number of hits
    return days;
  }

  public static int reverseNumber(int n) {
    String number = String.valueOf(n);
    StringBuilder sb = new StringBuilder();
    for (int i = number.length()-1; i >= 0; i--) {
      sb.append(number.charAt(i));
    }
    return Integer.parseInt(sb.toString());
  }
}
