package com.tsunazumi.quiver;

public class LongestCommonPrefix {

  public static void main(String[] args) {
    String[] strings = { "flow", "flower", "flight" };
    String result = findIt(strings);
    System.out.println(result);
  }

  private static String findIt(String[] strings) {
    if (strings == null || strings.length == 0) {
      return "";
    }

    // take the first item in the array as the test sample
    String common = strings[0];
    // loop through the rest of the strings in the array
    for (int i = 1; i < strings.length; i++) {
      // while the current string does not contain the common string
      // shorten the common string by one character at a time and keep checking
      while (strings[i].indexOf(common) != 0) {
        // if the length is eventually 0 then we don't have anything in common
        if (common.length() == 0) {
          return "";
        }
        // shorten it down by one char and move to the next check
        common = common.substring(0, common.length() - 1);
      }
    }
    return common;
  }
}
