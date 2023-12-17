package com.tsunazumi.interview;

public class Palindrome {

//  public boolean isPalindrome(String testValue) {
//    if (testValue == null || testValue.equals("")) {
//      return false;
//    }
//    char[] charsValue = testValue.toCharArray();
//    for (int i = 0; i < charsValue.length /2; i++) {
//      char temp = charsValue[i];
//      charsValue[i] = charsValue[charsValue.length - 1 - i];
//      charsValue[charsValue.length - 1 - i] = temp;
//    }
//    String endResult = String.valueOf(charsValue);
//    return (endResult.equals(testValue));
//  }

  public boolean isPalindrome(String testValue) {
    if (testValue == null || testValue.equals("")) {
      return false;
    }
    for (int i = 0; i < testValue.length() / 2; i++) {
      if (testValue.charAt(i) != testValue.charAt(testValue.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
