package com.tsunazumi.algorithms.hackerrank.interviewprep;

import java.util.*;

public class MakingAnagrams {

  public static void main(String[] args) {
    String one = "ccdec";
    String two = "abcc";
    int result = makeAnagram(one, two);
    System.out.println(result);
  }
  public static int makeAnagram(String a, String b) {
    int count = 0;

    List<String> processedLetters = new ArrayList<>();

    for (int i = 0; i < a.length(); i++) {
      String value = a.substring(i, i+1);
      if (!processedLetters.contains(value)) {
        // Find match in other word.
        if (!b.contains(value)) {
          count++;
        }
        else {
          // find diff of letter occurences
          int aCount = countOccurances(value, a);
          int bCount = countOccurances(value, b);
          int diff = Math.abs(aCount - bCount);
          count += diff;

          processedLetters.add(value);
        }
      }

    }

    for (int i = 0; i < b.length(); i++) {
      String value = b.substring(i, i+1);
      if (!processedLetters.contains(value)) {
        // Find match in other word.
        if (!a.contains(value)) {
          count++;
        }
      }

    }

    return count;
  }

  public static int countOccurances(String s, String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++ ) {
      String value = str.substring(i, i+1);
      if (s.equals(value)) {
        count++;
      }
    }
    return count;
  }
}
