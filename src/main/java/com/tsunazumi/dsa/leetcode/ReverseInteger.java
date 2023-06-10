package com.tsunazumi.dsa.leetcode;

public class ReverseInteger {
  public static void main(String[] args) {
    int input = 1534236469 ;
    int result = reverseInteger(input);
    System.out.println(result);
  }

  public static int reverseInteger(int input) {
    boolean isNegative = false;
    // convert integer to string
    String strVal = String.valueOf(input);
    // strip off the negative sign if it exists
    if (strVal.startsWith("-")) {
      isNegative = true;
      strVal = strVal.substring(1);
    }
    char[] charVal = strVal.toCharArray();

    // reverse string
    for (int i=0; i < charVal.length/2; i++) {
      char temp = charVal[i];
      charVal[i] = charVal[charVal.length - i - 1];
      charVal[charVal.length - i - 1] = temp;
    }
    // convert to String
    StringBuilder sb = new StringBuilder();
    if (isNegative) {
      sb.append("-");
    }
    for (int i=0; i < charVal.length; i++) {
      sb.append(charVal[i]);
    }
    // convert to integer
    try {
      int result = Integer.parseInt(sb.toString());
      if (Math.pow(-2, 31) <= result && result <= Math.pow(2, 31) - 1) {
        return result;
      }
    }
    catch(NumberFormatException e) {
     return 0;
    }
    return 0;
  }
}
