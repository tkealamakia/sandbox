package com.tsunazumi.scratch;

import java.util.HashMap;
import java.util.Map;

public class AreAnagrams {
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    boolean result = areAnagrams(str1, str2);
    System.out.println(result);
  }

  public static boolean areAnagrams(String str1, String str2) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : str1.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (char c : str2.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) - 1);
    }

    int sum = map.values().stream().mapToInt(Integer::intValue).sum();
    return sum == 0;
  }
}
