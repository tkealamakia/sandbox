package com.tsunazumi.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
  public static void main(String[] args) {
    //List list = Arrays.asList(1, 2, 2, 3, 1, 2);
    List list = Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5);
    System.out.println(pickingNumbers(list));
  }

  public static int pickingNumbers(List<Integer> a) {
    Integer arr[] = new Integer[a.size()];
    arr = a.toArray(arr);

    int num1 = 0;
    int num2 = 0;
    int count = 0;
    int masterCount = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i != j) {
          if (Math.abs(arr[i] - arr[j]) <= 1) {
            num1 = arr[i];
            num2 = arr[j];
            // count those occurances
            for (int k = 0; k < arr.length; k++) {
              if (arr[k] == num1 || arr[k] == num2) {
                count++;
              }
            }
            if (count > masterCount) {
              masterCount = count;
            }
            count = 0;

          }
        }
      }
    }
    return masterCount;

//    int masterCount = 0;
//
//    for (int i = 0; i < arr.length; i++) {
//      int count = 1;
//      for (int j = 0; j < arr.length; j++) {
//        if (i != j) {
//          if (Math.abs(arr[i] - arr[j]) <= 1) {
//
//            count++;
//          }
//        }
//      }
//      if (count > masterCount) {
//        masterCount = count;
//      }
//    }
//    return masterCount;
  }
}
