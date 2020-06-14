package com.tsunazumi.misc;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Foo {
  public static void main(String [] args) {
    String result = Stream.of("hello", "world")
        .reduce("!", (a, b) -> b + "-" + a);
    System.out.println(result);
  }
}
