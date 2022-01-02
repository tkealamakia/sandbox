package com.tsunazumi.algorithms.hackerrank.interviewprep;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(6, 4, 1);
    countSwaps(numbers);

  }

  public static void countSwaps(List<Integer> a) {
    Integer[] numbers = new Integer[a.size()];
    a.toArray(numbers);
    int swaps = 0;
    for (int i=0; i < numbers.length; i++) {
      //loop through the rest
      for (int j=i+1; j < numbers.length; j++) {
        if (numbers[i] > numbers[j]) {
          swap(numbers,i,j);
          swaps++;
        }
      }
    }

    System.out.println("Array is sorted in " + swaps + " swaps.");
    System.out.println("First Element: " + numbers[0]);
    System.out.println("Last Element: " + numbers[numbers.length-1]);

  }

  public static void swap(Integer[] numbers, int pos1, int pos2) {
    int temp = numbers[pos1];
    numbers[pos1] = numbers[pos2];
    numbers[pos2] = temp;
  }
}
