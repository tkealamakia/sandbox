package com.tsunazumi.misc;

public class ShortestRange {

  public static void main(String[] args) {
    int[] l1 = { 4, 10, 15, 24, 26};
    int[] l2 = { 0, 9, 12, 20 };
    int[] l3 = { 5, 18, 22, 30 };

    int[][] master = {l1, l2, l3};


    //int minArray = findMinArray(master);
    int shortestRange = findShortestRange(master);
    System.out.println(shortestRange);


  }

  private static int findShortestRange(int[][] master) {
    int l1index = 0;
    int l2index = 0;
    int l3index = 0;
    int minArray = 100;
    int longest = 100;

    while (minArray != 10) {
      if (l1index >= master[0].length || l2index >= master[1].length || l3index >= master[2].length) {
        return longest;
      }
      longest = findLongestRange(master[0][l1index], master[1][l2index], master[2][l3index]);
      minArray = findMinArray(master[0][l1index], master[1][l2index], master[2][l3index]);
      if (minArray == 0) {
        l1index++;
      } else if (minArray == 1) {
        l2index++;
      } else if (minArray == 2) {
        l3index++;
      }
    }
    return longest;

  }

  private static int findLongestRange(int l1, int l2, int l3) {
    int a = l1 - l2;
    int b = l1 - l3;
    int c = l2 - l1;
    int d = l2 - l3;
    int e = l3 - l1;
    int f = l3 - l2;
    int [] arr = { a, b ,c, d, e, f};
    int longest = 0;
    for (int i = 0; i < arr.length; i++ ) {
      if (arr[i] > longest) {
        longest = arr[i];
      }
    }
    return longest;
  }

  private static int findMinArray(int l1, int l2, int l3) {

    if (l1 < l2 && l1 < l3) {
      return 0;
    }
    if (l2 < l1 && l2 < l3) {
      return 1;
    }
    if (l3 < l2 && l3 < l1) {
      return 2;
    }
    return 10;
  }
}
