package com.tsunazumi.algorithms.hackerrank;

public class TimeConversion {

  public static void main(String[] args) {
    String s = "12:05:45PM";

    String tod = s.substring(s.length() - 2, s.length());
    String hours = s.substring(0, 2);

    String output ="";
    if (tod.equals("PM")) {
      int i = Integer.parseInt(hours);
      if (hours.equals("12")) {
        output = i + s.substring(2, 8);
      }
      else {
        i += 12;
        output = i + s.substring(2, 8);
      }
    }
    else {
      if (hours.equals("12")) {
        output = "00" + s.substring(2,8);
      }
      else {
        output = s.substring(0, s.length() - 2);
      }
    }

    System.out.println(output);
  }
}
