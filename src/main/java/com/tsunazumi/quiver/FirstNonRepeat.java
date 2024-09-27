package com.tsunazumi.quiver;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
  public static void main(String[] args) {
    String str = "aabbccddefg";
    String result = firstNonRepeat2(str);
    System.out.println(result);
  }

  private static String firstNonRepeat(String str) {
    String current = "";
    for (Character c : str.toCharArray()) {
      // trap for expected pattern
      if (!current.startsWith(c.toString()) && current.length() == 2) {
        // at a new pair
        current = c.toString();
        continue;
      }
      // trap for unexpected pattern
      if (!current.startsWith(c.toString()) && current.length() == 1) {
        // found the non repeat
        return current;
      }
      // accumulate
      current = current + c;
    }
    return null;
  }

  private static String firstNonRepeat2(String str) {
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (Character c : str.toCharArray()) {
      map.put(c, map.getOrDefault(c,0) + 1);
    }
    for (Character c : str.toCharArray()) {
      if (map.get(c) == 1) {
        return c.toString();
      }
    }
    return "nothing found";
  }
}
