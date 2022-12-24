package com.tsunazumi.algorithms.hackerrank.algorithms.archive;

public class LeftRotation {
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    //int[] a = {33,47,70,37,8,53,13,93,71,72,51,100,60,87,97};
    int d = 1;
    leftRotate(a, d);
    /*
    int[] b = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      int position = 0;
      if (i + d > a.length-1) {
        position = i + d - a.length;
      } else {
        position = i + d;
      }
      b[i] = a[position];
    }

     */


    for (int i =0; i < a.length; i++) {
      System.out.print(a[i]);
      System.out.print(",");
    }

  }

  public static void rightRotateByOne(int[] A) {
    int last = A[A.length - 1];
    for (int i = A.length - 2; i >=0; i--) {
      A[i + 1] = A[i];
    }
    A[0] = last;
  }

  public static void rightRotate(int[] A, int k) {
    for (int i = 0; i < k; i++) {
      rightRotateByOne(A);
    }
  }

  public static void leftRotateByOne(int[] A) {
    int first = A[0];
    for (int i = 1; i < A.length; i++) {
      A[i - 1] = A[i];
    }
    A[A.length-1] = first;
  }

  public static void leftRotate(int[] A, int k) {
    for (int i = 0; i < k; i++) {
      leftRotateByOne(A);
    }
  }

}
