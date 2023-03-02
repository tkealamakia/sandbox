package com.tsunazumi.dsa.leetcode;

public class ValidPalindrome {
  public static void main(String[] args) {
    String s = "0P";
//    System.out.println(reverseString(s));
    System.out.println(isPalindrome(s));
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
  }
  public static String reverseString(String s) {
    // loop through all characters up to the midpoint
    char[] chars = s.toCharArray();
    for (int i=0; i < chars.length / 2; i++) {
      char temp = chars[i];
      chars[i] = chars[chars.length - 1 - i];
      chars[chars.length - 1 - i] = temp;
    }

    String s1 = String.copyValueOf(chars);
    return s1;
  }

  public static boolean isPalindrome(String s) {
    // remove all non alpha chars
    s = cleanse(s);
    // loop through all characters up to the midpoint
    char[] chars = s.toCharArray();
    for (int i=0; i < chars.length / 2; i++) {
      char temp = chars[i];
      chars[i] = chars[chars.length - 1 - i];
      chars[chars.length - 1 - i] = temp;
    }

    String s1 = String.valueOf(chars);
    return s1.equals(s);
  }

  public static String cleanse(String s) {
    s = s.toLowerCase();
    char[] chars = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i=0; i < chars.length; i++) {
      if (
          (chars[i] >= 97 && chars[i] <= 122) ||
          (chars[i] >= 48 && chars[i] <= 57)

      ){
        // add it to the string
        sb.append(chars[i]);
      }
    }
    return sb.toString();
  }
}
