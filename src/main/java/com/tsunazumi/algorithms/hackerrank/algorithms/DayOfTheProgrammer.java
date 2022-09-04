package com.tsunazumi.algorithms.hackerrank.algorithms;

public class DayOfTheProgrammer {
  public static void main(String[] args) {
    System.out.println(dayOfProgrammer(2016));
    System.out.println(dayOfProgrammer(2017));
    System.out.println(dayOfProgrammer(1800));
  }
  static String dayOfProgrammer(int year) {
    boolean isJulian = isJulian(year);
    boolean isLeapYear = false;
    if (year == 1918) {
      return "26.09.1918";
    }
    if (isJulian(year)) {
      if (isJulianLeapYear(year)) {
        return "12.09." + year;
      }
      else {
        return "13.09." + year;
      }
    }
    // Gregorian
    else {
      if (isGregorianLeapYear(year)) {
        return "12.09." + year;
      }
      else {
        return "13.09." + year;
      }
    }
  }

  static boolean isJulian(int year) {
    return year >= 1919;
  }

  static boolean isJulianLeapYear(int year) {
    // Year is divisable by 400 or year is divisable by 4 and not by 100
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }

  static boolean isGregorianLeapYear(int year) {
    return year % 4 == 0;
  }
}
