package com.tsunazumi.misc;

import java.util.*;

public class Foo {
  public static void main(String [] args) throws InterruptedException {
    String url = "http://foo.com/aps/";
    System.out.println(url.substring(0, url.length()-1));
    List<String> values = new ArrayList<>();
    int total = 0;
    int runs = 100;
    int labelruns = 100;

    for (int i = 0; i < 1000000; i++) {
      if (i == 500000) {
        values.add("randomtext^value");
      }
      double random = Math.random() * 99 + 1;
      values.add(Double.toString(random) + "^" + Double.toString(random));
    }
    while (runs != 0) {
      Date start = new Date();

      boolean result = values.stream()
          .map(s -> s.split("\\^"))
          .filter(a -> a.length >= 2)
          .anyMatch(a -> a[0].equals("randomtext") && a[1].equals("value"));
//          .filter(a -> a.length >= 2 && a[0].equals("randomtext"))
//          .anyMatch(a -> a[1].equals("value"));

      Date end = new Date();

      long duration = end.getTime() - start.getTime();

      total += duration;
      runs--;
    }
    System.out.println("Total of all runs");
    System.out.println(total);
    System.out.println("Average of " + labelruns + " runs");
    System.out.println(total/labelruns);
  }
}
