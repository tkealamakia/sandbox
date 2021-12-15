package com.tsunazumi.hackerrank;

public class RepeatedString {
  public static void main(String[] args) {
//    String s = "jdiacikk";
//    long n = 899491l;
    String s = "aba";
    long n = 10;

    long count = 0;
    int numA = 0;
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'a') {
        numA++;
      }
    }
    long substringsToAnalyze = n / s.length();
    long totalCount = substringsToAnalyze * numA;

    long remainder = n % s.length();

    for (int i = 0; i < remainder; i++) {
      if (s.charAt(i) == 'a') {
        totalCount++;
      }
    }





    /*
    long count = 0;
    while(n > 0) {
      for (int i = 0; i < s.length() && n > 0; i++) {
        if (s.charAt(i) == 'a') {
          count++;
        }
        n--;
      }
    }

     */

    System.out.println(totalCount);







  }
}
