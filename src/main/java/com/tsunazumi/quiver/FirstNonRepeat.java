package com.tsunazumi.quiver;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
  public static void main(String[] args) {
    String str = "aabbccddefg";
    String result = firstNonRepeat(str);
    System.out.println(result);
  }


  private static String firstNonRepeat(String str) {
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (Character c : str.toCharArray()) {
      map.put(c, map.getOrDefault(c,0) + 1);
    }

    return map.entrySet().stream()
        .filter(entry -> entry.getValue() == 1)
        .map(entry -> entry.getKey().toString())
        .findFirst()
        .orElse("");
  }
}
