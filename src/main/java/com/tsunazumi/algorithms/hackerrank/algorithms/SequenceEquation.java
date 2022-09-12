package com.tsunazumi.algorithms.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {

  public static void main(String[] args) {
    List<Integer> input = Arrays.asList(5,2,1,3,4);
    List<Integer> output = permutationEquation(input);
    System.out.println(output);
  }

  public static List<Integer> permutationEquation(List<Integer> p) {
    List<Integer> output = new ArrayList<>();
    int length = p.size();
    for (int i=1; i <= length; i++) {
      // find index of i
      for (int j=0; j < p.size(); j++) {
        if (p.get(j) == i) {
          int firstFound = j+1;
          for (int z=0; z < p.size(); z++) {
            if (p.get(z) == firstFound) {
              int secondFound = z+1;
              output.add(secondFound);
            }
          }
        }
      }
    }
    return output;
  }
}
