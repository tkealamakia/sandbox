package com.tsunazumi.quiver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AreAnagrams {
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    boolean result = areAnagrams(str1, str2);
    System.out.println(result);
  }

  public static boolean areAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) return false;

    Map<Character, Integer> map = new HashMap<>();
    for (Character c : str1.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (Character c : str2.toCharArray()) {
      if (!map.containsKey(c) || map.get(c) == 0) {
        return false;
      }
      map.put(c, map.get(c) - 1);
    }

    return true;

  }

}
