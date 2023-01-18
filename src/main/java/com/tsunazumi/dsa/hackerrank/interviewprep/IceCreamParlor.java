package com.tsunazumi.dsa.hackerrank.interviewprep;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class IceCreamParlor {

  public static void main(String[] args) {
    List<Integer> cost = Arrays.asList(2,2,4,3);
    int money = 4;
    whatFlavors(cost, money);

  }

  public static void whatFlavors(List<Integer> cost, int money) {
    Integer[] costs = new Integer[cost.size()];
    cost.toArray(costs);

    HashMap<Integer, Integer> map = new HashMap<>(); // key = cost, value = ice cream ID
    for (int i = 0; i < costs.length; i++) {
      int icecreamID = i + 1;
      int c       = costs[i];

      /* Find 2 flavors to buy that sum to "money" */
      int otherCost  = money - c;
      if (map.containsKey(otherCost)) {
        System.out.println(map.get(otherCost) + " " + icecreamID);
      }

      map.putIfAbsent(c, icecreamID);
    }

  }

  private static Integer findRemainderPosition(List<Integer> cost, int remainder) {
    Integer[] list = new Integer[cost.size()];
    cost.toArray(list);
    int i = Arrays.binarySearch(list, remainder);

    Collections.sort(cost);
    Integer[] list2 = new Integer[cost.size()];
    cost.toArray(list2);
    int j = Arrays.binarySearch(list2, remainder);


    int diff = Math.abs(i-j);

    return diff;

  }
}
