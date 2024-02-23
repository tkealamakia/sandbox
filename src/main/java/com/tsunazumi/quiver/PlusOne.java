package com.tsunazumi.quiver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

public class PlusOne {

  public static void main(String[] args) {
    int[] digits = {9,8,7,6,5,4,3,2,1,0};

    int[] result = doit(digits);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
  private static int[] doit(int[] digits) {
    // convert array to number
    StringBuilder number = new StringBuilder();
    for (int i = 0; i < digits.length; i++) {
      number.append(digits[i]);
    }
    long num = Long.parseLong(number.toString());
    num = num + 1;
    // convert back to array
    String s = String.valueOf(num);
    int[] result = new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
      result[i] = Integer.parseInt(s.substring(i,i+1));
    }
    return result;
  }

//  private static int[] doit(int[] digits) {
//    List<Integer> list = new ArrayList<>();
//    for (int i = 0; i < digits.length; i++) {
//      if (i == digits.length - 1) {
//        // on the last digit, if it's a 9 then add 1 and 0
//        if (digits[i] == 9) {
//          list.add(1);
//          list.add(0);
//        } else {
//          list.add(digits[i] + 1);
//        }
//      } else {
//        list.add(digits[i]);
//      }
//    }
//    return list.stream().mapToInt(Integer::intValue).toArray();
//  }
}
