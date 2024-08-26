package com.tsunazumi.quiver;

public class LongestCommonPrefix {

  public static void main(String[] args) {
    String[] strings = { "flower", "flow", "flight" };
    String result = findIt(strings);
    System.out.println(result);
  }

  private static String findIt(String[] strings) {
    if (strings == null || strings.length == 0) {
      return "";
    }

    String common = strings[0];
    for (int i = 1; i < strings.length; i++) {
      while (strings[i].indexOf(common) != 0) {
        // shorten it down and move on
        if (common.length() == 0) {
          return "";
        }
        common = common.substring(0, common.length() - 1);

      }
    }
    return common;
  }
}
