package com.tsunazumi.dsa.hackerrank.algorithms.archive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateLeft {

  public static void main(String[] args) {
    List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> result = rotateLeft(4, arr);
    result.stream().forEach(System.out::println);
    result.forEach(System.out::println);
  }


  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    List<Integer> holder = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    for (int i=0; i <= d-1; i++) {
      holder.add(arr.get(i));
    }
    for (int i=d; i <= arr.size()-1; i++) {
      result.add(arr.get(i));
    }
    for (int i=0; i <= holder.size()-1; i++) {
      result.add(holder.get(i));
    }

    return result;
  }
}
