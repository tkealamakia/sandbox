package com.tsunazumi.dsa.hackerrank.algorithms.archive;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class AppleAndOrange {
  public static void main(String[] args) {
//    int[] apples = {-2,2,1};
//    int[] oranges = {5, -6};
//    countApplesAndOranges(7, 11, 5, 15, apples, oranges);
    int[] apples = {2};
    int[] oranges = {-2};
    countApplesAndOranges(2, 3, 1, 5, apples, oranges);
  }

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

    BiPredicate<Integer, Integer> hits = (fruit, type) -> fruit + type >= s && fruit + type <= t;
    long appleHit = Arrays.stream(apples)
        .filter(el -> hits.test(el,a))
        .count();
    long orangeHit = Arrays.stream(oranges)
        .filter(el -> hits.test(el,b))
        .count();

    System.out.println(appleHit);
    System.out.println(orangeHit);

  }

}
