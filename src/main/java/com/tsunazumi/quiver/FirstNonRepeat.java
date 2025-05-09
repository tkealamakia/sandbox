package com.tsunazumi.quiver;

import java.util.*;

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

  private static String firstNonRepeat2(String str) {
    List<Character> list = new ArrayList<>();
    char[] chars = str.toCharArray();
    for (char c : chars) {
      if (list.contains(c)) {
        list.remove((Character)c);
      } else {
        list.add(c);
      }
    }

    return list.get(0).toString();
  }
}
