package com.tsunazumi.misc;

import java.math.BigDecimal;

public class Foo {
  public static void main(String [] args) {
    Integer i = new Integer(1);
    Integer j = new Integer(1);

    if (i == j) {
      System.out.println("wtf?");
    }
    if (i.equals(j)) {
      System.out.println("omg");
    }

    String foo = "32.234323";

    new BigDecimal(foo);
  }
}
