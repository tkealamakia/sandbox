package com.tsunazumi.buchalka;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas {

  public static void main(String[] args) {

    List<Integer> foo = Arrays.asList(1,2,3);
    int i = foo.stream()
        .mapToInt(Integer::intValue)
        .min().orElseThrow(NoSuchElementException::new);
    System.out.println(i);


    new Thread(() -> {
      String myString = "Let's split";
      String[] parts = myString.split(" ");
      for (String part: parts) {
        System.out.println(part);
      }
    }).start();

    System.out.println("================");
    int number = 25;
    Runnable runnable = () -> {
        String myString = "Let's split";
        String[] parts = myString.split(" ");
        for (String part: parts) {
          System.out.println(part);
        }
      System.out.println(number);
    };

    new Thread(runnable).start();

//    Function<String, String> lambdaFunction = s -> {
//      StringBuilder returnVal = new StringBuilder();
//      for (int i = 0; i < s.length(); i++) {
//        if (i % 2 == 1) {
//          returnVal.append(s.charAt(i));
//        }
//      }
//      return returnVal.toString();
//    };
//
//    System.out.println(everySecondCharacter(lambdaFunction, "weoifjwfjew"));
//

    Predicate<Integer> foobarPredicate =  x -> x > 5;
    System.out.println(foobarPredicate.test(6));

    Supplier<Integer> randomIntSupplier = () -> new Random().nextInt(100);
    System.out.println(randomIntSupplier.get());
//
//    List<String> topNames2015 = Arrays.asList(
//        "Amelia",
//        "Olivia",
//        "emily",
//        "Isla",
//        "Ava",
//        "oliver",
//        "Jack",
//        "Charlie",
//        "harry",
//        "Jacob"
//    );
//
//    topNames2015.stream()
//        .map(s -> String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1))
//        .sorted()
//        .peek(System.out::println)
//        .forEach(System.out::println);
//
//
//  }
//  public static String everySecondCharacter(Function<String, String> f, String s) {
//    return f.apply(s);
  }
}
