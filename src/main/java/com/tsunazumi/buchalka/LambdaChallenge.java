package com.tsunazumi.buchalka;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaChallenge {

  public static void main(String[] args) {
//    Runnable runnable = new Runnable() {
//      @Override
//      public void run() {
//        String myString = "Let's split this up into an array";
//        String[] parts = myString.split(" ");
//        for (String part: parts) {
//          System.out.println(part);
//        }
//      }
//    };
//    runnable.run();
//
//    Runnable runnable1 = () -> {
//      String myString = "Let's split this up into an array";
//      String[] parts = myString.split(" ");
//      for (String part: parts) {
//        System.out.println(part);
//      }
//    };
//    runnable1.run();

    Function<String, String> lambdaFunction = s -> {
      StringBuilder returnVal = new StringBuilder();
      for (int i=0; i < s.length(); i++) {
        if (i % 2 == 1) {
          returnVal.append(s.charAt(i));
        }
      }
      return returnVal.toString();
    };

    System.out.println(everySecondCharacter("1234567890", lambdaFunction));

    Supplier<String> iLoveJava = () -> "I love Java!";

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
        .map( s -> s.substring(0,1).toUpperCase() + s.substring(1))
        .filter(x -> !x.isEmpty())
        .peek(System.out::println)
        .count();

//        .sorted()
//        .collect(Collectors.toList());
//    long result2 = topNames2015.stream()
//        .filter(a -> a.toLowerCase().startsWith("a"))
//        .count();
//    System.out.println(result2);








  }
  static String everySecondCharacter(String s, Function<String, String> fun) {
    return fun.apply(s);
  }
}
