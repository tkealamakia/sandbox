package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class AppendDelete {
  public static void main(String[] args) {
    String s = "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
    String t = "bsdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
    int k = 100;
    System.out.println(appendAndDelete(s, t, k));

  }

  public static String appendAndDelete(String s, String t, int k) {

    // Return yes if the same words.
    if (s.equals(t)) {
      return "Yes";
    }

    // Return yes if the same length
    if (s.length() == t.length()) {
      if (s.length() < k) {
        return "Yes";
      } else {
        return "No";
      }
    }

    // Return yes of all letters are the same in both
    String test = s.substring(0,1);
    boolean same = true;
    for (int i = 0; i < s.length(); i++) {
      if (!test.equals(s.substring(i, i+1))) {
        same = false;
        break;
      }
    }
    for (int i = 0; i < t.length(); i++) {
      if (!test.equals(t.substring(i, i+1))) {
        same = false;
        break;
      }
    }
    if (same) {
      return "Yes";
    }
    // find the shorter length
    String shorter = "";
    String longer = "";
    if (s.length() < t.length()) {
      shorter = s;
      longer = t;
    } else if (t.length() < s.length()) {
      shorter = t;
      longer = s;
    } else {
    }



    // Only loop if the lengths are different
    int index = 0;
    for (int i = 0; i < shorter.length(); i++) {
      if (s.charAt(i) != t.charAt(i)) {
        //time to record index
        index = i;
        break;
      }
    }

//    if (index == 0 && shorter.equals("")) {
//      return "Yes";
//    }

    if ((s.length() - index) + (t.length() - index) == k) {
      return "Yes";
    }
    return "No";


  }
}
