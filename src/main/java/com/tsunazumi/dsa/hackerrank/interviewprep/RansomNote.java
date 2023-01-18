package com.tsunazumi.dsa.hackerrank.interviewprep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {

  public static void main(String[] args) {
//    give me one grand today night
//    give one grand today
    List<String> magazine = Arrays.asList("give", "me", "one", "grand", "today", "night");
    List<String> note = Arrays.asList("give", "one", "grand", "today");
    checkMagazine(magazine, note);
  }

  public static void checkMagazine(List<String> magazine, List<String> note) {
    // put note into a Map
//    Map<String, Integer> magazineMap = magazine.stream()
//        .collect(Collectors.toMap(k -> k, k -> 1));
    Map<String, Integer> magazineMap = new HashMap<>();
    for (String m : magazine) {
      if (magazineMap.containsKey(m)) {
        int val = magazineMap.get(m);
        magazineMap.put(m, ++val);
      }
      else {
        magazineMap.put(m, 1);
      }
    }

    for (String n : note) {
      //check if the value exists and is false
      if (magazineMap.containsKey(n) && magazineMap.get(n) > 0) {
        // passes
        int val = magazineMap.get(n);
        magazineMap.put(n, --val);
      }
      else {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");

  }
}
