package com.tsunazumi.misc;

public class RomanNumerals {

  public static void main(String[] args) {

    int i = 50;
    System.out.println(convertNumberToRoman(i));



  }

  public static String convertNumberToRoman(int num) {
    String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] tens  = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] hundreds = {"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

    String romanNum = hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + units[num % 10];
    return romanNum;

  }
}
