package com.tsunazumi.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {
  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    System.out.println(isAnagram(s, t));

  }
  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] chars = s.toCharArray();
    List<Character> list = new ArrayList<>();
    for (int i = 0; i < chars.length; i++) {
      list.add(chars[i]);
    }
    char[] chars2 = t.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      list.remove(Character.valueOf(chars2[i]));
    }
    if (list.size() == 0) {
      return true;
    }
    return false;
  }
}
