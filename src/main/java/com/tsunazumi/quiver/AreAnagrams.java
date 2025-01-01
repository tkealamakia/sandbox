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
    Map<Character, Integer> map = new HashMap<>();
    for (Character c : str1.toCharArray()) {
      map.merge(c, 1, Integer::sum);
    }
    for (Character c : str2.toCharArray()) {
      map.merge(c, -1, Integer::sum);
    }
    return map.values().stream().allMatch(count -> count == 0);
  }

}
