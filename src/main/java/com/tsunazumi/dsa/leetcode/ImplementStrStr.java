package com.tsunazumi.dsa.leetcode;

public class ImplementStrStr {
  public static void main(String[] args) {
//    String needle = "sad";
//    String haystack = "sadbutsad";
    String haystack = "mississippi";
    String needle = "issipi";
//    String needle = "leeto";
//    String haystack = "leetcode";
    System.out.println(strStr(haystack, needle));
  }

  static int strStr(String haystack, String needle) {
    if (needle.length() > haystack.length()) {
      return -1;
    }
    char[] nChars = needle.toCharArray();
    char[] hChars = haystack.toCharArray();
    Outer:
    for (int i = 0; i < hChars.length; i++) {
      // found a segment, save it
      int firstSeg = i;
      if (nChars[0] == hChars[i]) {
        // loop through
        for (int j = 1; j < nChars.length; j++) {
          if (i+j < hChars.length && nChars[j] == hChars[i+j]) {
            // keep going
          } else {
            continue Outer;
          }
        }
        return firstSeg;
      }
    }
    return -1;
  }
}
