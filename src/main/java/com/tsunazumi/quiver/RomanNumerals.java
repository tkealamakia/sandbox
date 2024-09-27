package com.tsunazumi.quiver;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

  public static void main(String[] args) {
    System.out.println(intToRoman(1982));
    System.out.println(romanToInt("MCMLXXXII"));

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

  public static int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int result = 0;
    for (int i = 0; i <s.length(); i++) {
      if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
        result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
      } else {
        result += map.get(s.charAt(i));
      }
    }
    return result;
  }
}
