package com.tsunazumi.dsa.leetcode;

public class LongestCommonPrefix {
  public static void main(String[] args) {
    //String[] strs = {"flower", "flow", "flight"};
    String[] strs = {"cir", "car"};
    System.out.println(longestCommonPrefix(strs));

  }
  public static String longestCommonPrefix(String[] strs) {
    StringBuilder prefix = new StringBuilder();
    // Take the first item
    char[] current = strs[0].toCharArray();
    for (int i = 1; i < strs.length; i++) {
      // Loop through each char
      char[] chars = strs[i].toCharArray();
      for (int j = 0; j < chars.length && j < current.length; j++) {
        if (chars[j] == current[j]) {
          prefix.append(chars[j]);
        } else {
          break;
        }
      }
      current = prefix.toString().toCharArray();
      prefix = new StringBuilder();
    }
    return String.valueOf(current);
  }
}
