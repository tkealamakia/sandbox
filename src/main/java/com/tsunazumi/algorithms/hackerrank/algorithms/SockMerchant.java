package com.tsunazumi.algorithms.hackerrank.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SockMerchant {
  public static void main(String[] args) {
    int[] socks = {1,1,1,3,3,3,3,2,4,5,5};
    List<Integer> ints = Arrays.stream(socks).boxed().collect(Collectors.toList());

    Map<Integer, Long> counters = ints.stream()
        .collect(Collectors.groupingBy(p -> p.intValue(),
            Collectors.counting()));

    Long aLong = counters.entrySet().stream()
        .collect(Collectors.summingLong(p -> p.getValue() / 2));

    System.out.println(aLong);


  }
}
