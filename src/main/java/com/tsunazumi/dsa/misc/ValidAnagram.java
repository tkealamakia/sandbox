package com.tsunazumi.dsa.misc;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    System.out.println(isAnagram(s, t));
  }

  public static boolean isAnagram(String s, String t) {
    Map<Character, Integer> hp = new HashMap<>();
    if (s.length() != t.length()) {
      return false;
    }

    for (char chs : s.toCharArray()) {
      hp.put(chs, hp.getOrDefault(chs, 0) +1 );
    }

    for (char cht: t.toCharArray()) {
      if (hp.containsKey(cht)) {
        hp.put(cht, hp.get(cht) - 1);
        if (hp.get(cht) < 0) {
          return false;
        }
      }
      else {
        return false;
      }
    }

    return true;

  }
}
