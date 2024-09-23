package com.tsunazumi.quiver;

public class RomanNumerals {

  public static void main(String[] args) {
    System.out.println(intToRoman(345));

  }

  public static String intToRoman(int num) {
    String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] thousands = {"", "M", "MM", "MMM"};

    String unitPos = units[num % 10];
    String tenPos = tens[(num % 100) / 10];
    String hundredPos = hundreds[(num % 1000) / 100];
    String thousandPos = thousands[num / 1000];

    return thousandPos + hundredPos + tenPos + unitPos;
  }
}
