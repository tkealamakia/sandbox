package com.tsunazumi.algorithms.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotation {
  public static void main(String[] args) {
    List<Integer> result = circularArrayRotation(Arrays.asList(3,4,5), 2, Arrays.asList(1,2));
    System.out.println("Result");
    for (Integer i : result) {
      System.out.println(i);
    }
  }

  public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    Integer[] b = new Integer[a.size()];
    a.toArray(b);
    Integer[] c = new Integer[b.length];

    for (int i=0; i < b.length; i++) {
      if (k > b.length) {
        int r = k % b.length;
        int foo = i + r;
        if (foo >= b.length) {
          foo = foo % b.length;
        }
        System.out.println(foo);
        c[foo] = b[i];
      }
      else {
        if (i + k < b.length) {
          System.out.println(i+k);
          c[i+k] = b[i];
        }
        else {
          System.out.println(Math.abs(b.length - (i+k)));
          c[Math.abs(b.length - (i+k))] = b[i];

        }
      }
    }

    List<Integer> returnValue = new ArrayList<>();
    for (Integer i : queries) {
      returnValue.add(c[i]);
    }
    return returnValue;
  }

}
