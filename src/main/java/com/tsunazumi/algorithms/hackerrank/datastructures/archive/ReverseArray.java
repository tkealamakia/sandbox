package com.tsunazumi.algorithms.hackerrank.datastructures.archive;

import java.util.Arrays;
import java.util.List;

public class ReverseArray {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,4,3,2);
    System.out.println(reverseArray(list));
  }

  public static List<Integer> reverseArray(List<Integer> a) {
    Integer[] inArr = new Integer[a.size()];
    a.toArray(inArr);
    for( int i = 0; i < inArr.length / 2; i++) {
      Integer temp = inArr[i];
      inArr[i] = inArr[inArr.length - i - 1];
      inArr[inArr.length - i - 1] = temp;
    }
    return Arrays.asList(inArr);
  }
}
