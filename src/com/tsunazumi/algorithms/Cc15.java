package com.tsunazumi.algorithms;

public class Cc15 {

  public static void main(String[] args) {
    System.out.println( new Cc15().oneEditInsert("unforgetable", "unforgettable"));

  }
  
  boolean oneEditInsert(String s1, String s2) {
    int index1 = 0;
    int index2 = 0;
    while(index2 < s2.length() && index1 < s1.length()) {
      if (s1.charAt(index1) != s2.charAt(index2)) {
        if (index1 != index2) {
          return false;
        }
        index2++;
      }
      else {
        index1++;
        index2++;
      }
    }
    return true;
  }

}
