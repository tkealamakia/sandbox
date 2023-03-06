package com.tsunazumi.dsa.leetcode;

public class ReverseString {
  public static void main(String[] args) {
    char[] s = new char[] {'h', 'e', 'l', 'l', 'o'};
    printIt(s);
    reverseString(s);
    printIt(s);


  }

  public static void reverseString(char[] s) {
    for (int i=0; i < s.length/2; i++) {
      char temp = s[s.length - 1 - i];
      s[s.length - 1 - i] = s[i];
      s[i] = temp;
    }
  }

  public static void printIt(char[] s) {
    for (char c : s) {
      System.out.println(c);
    }
  }
}
