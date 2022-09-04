package com.tsunazumi.algorithms.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
  public static void main(String[] args) {
    List<Integer> grades = Arrays.asList(73,67, 38, 33, 37);
    //List<Integer> grades = Arrays.asList(44,84,94,21,0,18,100,18,62,30,61,53,0,43,2,29,53,61,40,14,4,29,98,37,23,46,9,79,62,20,38,51,99,59,47,4,86,61,68,17,45,6,1,95,95 );
    List<Integer> results = new ArrayList<>();

    // 41 1, 42 2, 43 3*, 44 4*
    // 46 6, 47 7, 48 8*, 49 9*

    for (Integer i : grades) {
      if (i > 37) {
        if (i % 5 == 3 || i % 5 == 8) {
          results.add(i + 2);
        } else if (i % 5 == 4 || i % 5 == 9) {
          results.add(i + 1);
        } else {
          results.add(i);
        }
      } else {

      }
    }

    results.forEach(System.out::println);



  }
}
