package com.tsunazumi.quiver;

import java.util.ArrayList;
import java.util.List;

public class AreAnagrams {
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    boolean result = areAnagrams(str1, str2);
    System.out.println(result);
  }

  public static boolean areAnagrams(String str1, String str2) {
    List<Character> list = new ArrayList<>();
    for (Character c : str1.toCharArray()) {
      list.add(c);
    }

    for (Character c: str2.toCharArray()) {
      list.remove(c);
    }

    return list.isEmpty();
  }
}
