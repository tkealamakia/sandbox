package com.tsunazumi.buchalka;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

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




  }
  static String everySecondCharacter(String s, Function<String, String> fun) {
    return fun.apply(s);
  }
}
