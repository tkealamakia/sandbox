package com.tsunazumi.algorithms.hackerrank.algorithms.twentythree;

import java.util.*;

public class IcpcTeam {
  public static void main(String[] args) {
    List<String> people = Arrays.asList(
        "10101",
        "11110",
        "00010"
    );
    List<Integer> result = acmTeam(people);
    System.out.println(result);

  }

  public static List<Integer> acmTeam(List<String> topic) {
    // Brute force
    Map<String, Integer> memo = new HashMap<>();
    for (int i=0; i < topic.size(); i++) {
      for (int j=0; j < topic.size(); j++) {
        if (i == j) {
          continue;
        }
        String keyCheck = (j) + "," + (i);
        if (memo.containsKey(keyCheck)) {
          continue;
        }
        // add to count if a 1 exists in either person's topic
        int count = 0;
        String si = topic.get(i);
        String sj = topic.get(j);
        // loop through characters
        for (int k=0; k < si.length(); k++) {
          if (si.charAt(k) == '1' || sj.charAt(k) == '1') {
            count++;
          };
        }
        // record the result
        String key = (i) + "," + (j);
        memo.put(key, count);
      }
    }
    // find the largest count of topics
    int maxValueInMap = (Collections.max(memo.values()));
    // count how many have that largest count
    int count = (int)memo.values().stream().filter(v -> v == maxValueInMap).count();

    List<Integer> result = Arrays.asList(maxValueInMap, count);
    return result;

  }
}
