package com.tsunazumi.misc;

public class StringReversal {
  public static void main(String[] args) {
    String str = "foobar";
    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length/2; i++) {
      char temp = chars[i];
      chars[i] = chars[chars.length - 1 - i];
      chars[chars.length - 1 - i] = temp;
    }
    String s = String.valueOf(chars);
    System.out.println(s);

  }
}
