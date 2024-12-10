package com.tsunazumi.quiver;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

  public static void main(String[] args) {
    System.out.println(intToRoman(1982));
    System.out.println(romanToInt("MCMLXXXII"));
    System.out.println(romanToInt("MCMLXXI"));

  }

  public static String intToRoman(int num) {
    String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] thousands = {"", "M", "MM", "MMM"};

    // Mod of 10 will give the last position of the number
    // 1982 % 10 = 2
    String unitPos = units[num % 10];
    // Get the 10s position, but then only the first number of that
    // 1982 % 100 = 82. 82/10 = 8
    String tenPos = tens[(num % 100) / 10];
    // Get the 100s position, but then only the first number of that
    // 1982 % 1000 = 982. 982/100 = 9
    String hundredPos = hundreds[(num % 1000) / 100];
    // 1982 / 1000 = 1
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
    for (int i = 0; i < s.length(); i++) {
      // if the current character is greater than the last one
      // we have a prefixed numeral that needs to now be subtracted
      // MCM: 1000 + 100 = 1100, then another 1000.
      // Instead of adding 1000 to 1100, we instead take the last number, 100
      // multiply it by 2 (200 because we remove the addition from the last item).
      // Then take the current number and subtract that result (1000 - 200 = 800)
      // Then add that to the result (1100 + 800)
      if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
        result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
      } else {
        result += map.get(s.charAt(i));
      }
    }
    return result;
  }
}
