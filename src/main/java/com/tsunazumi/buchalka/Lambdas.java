package com.tsunazumi.buchalka;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambdas {

  public static void main(String[] args) {

    new Thread(() -> {
      System.out.println("foo");
      System.out.println("bar");
    }).start();
    Runnable runnable = () -> {
        String myString = "Let's split this up into an array";
        String[] parts = myString.split(" ");
        for (String part: parts) {
          System.out.println(part);
        }
    };

    Function<String, String> lambdaFunction = s -> {
      StringBuilder returnVal = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 1) {
          returnVal.append(s.charAt(i));
        }
      }
      return returnVal.toString();
    };

    System.out.println(everySecondCharacter(lambdaFunction, "weoifjwfjew"));

    Supplier<String> iLoveJava = () ->  "I love Java!" ;
    String supplierResult = iLoveJava.get();
    System.out.println(supplierResult);

    List<String> topNames2015 = Arrays.asList(
        "Amelia",
        "Olivia",
        "emily",
        "Isla",
        "Ava",
        "oliver",
        "Jack",
        "Charlie",
        "harry",
        "Jacob"
    );

    topNames2015.stream()
        .map(s -> String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1))
        .sorted()
        .peek(System.out::println)
        .forEach(System.out::println);


  }
  public static String everySecondCharacter(Function<String, String> f, String s) {
    return f.apply(s);
  }
}
