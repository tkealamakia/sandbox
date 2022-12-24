package com.tsunazumi.algorithms.hackerrank.algorithms.archive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {
  public static void main(String[] args) {
    List<Integer> input = Arrays.asList(5,4,4,2,2,8);
    List<Integer> result = new ArrayList<>();
    List<Integer> finalResult = cutTheSticks(input, result);
    for (int i : finalResult) {
      System.out.println(i);
    }
  }

  public static List<Integer> cutTheSticks(List<Integer> arr, List<Integer> result) {
    if (arr.size() == 0) {
      return result;
    }

    // find the smallest number
    int smallestNumber = arr.get(0);
    for (int i : arr) {
      if (i < smallestNumber) {
        smallestNumber = i;
      }
    }

    // cut that amount from each item in the list
    List<Integer> newArr = new ArrayList<>();
    for (int i : arr) {
      if (i - smallestNumber > 0) {
        newArr.add(i - smallestNumber);
      }
    }
    result.add(arr.size());
    return cutTheSticks(newArr, result);
  }

}

