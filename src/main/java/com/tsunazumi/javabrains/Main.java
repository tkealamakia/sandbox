package com.tsunazumi.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    List<Person> personList = Arrays.asList(
        new Person("Tom", "Kealamakia"),
        new Person("John", "Campbell"),
        new Person("Dwight", "Schrute")
    );

    Collections.sort(personList, ( p1, p2) -> p1.getLast().compareTo(p2.getLast()));

    printList(personList);

    Predicate<Person> pred = p -> p.getLast().startsWith("C");
    printConditionally(personList, pred);

  }

  public static <T> void printList(List<T> list) {
    list.forEach(System.out::println);
  }

  public static void printConditionally(List<Person> list, Predicate<Person> p) {
    list.stream()
        .filter(p)
        .forEach(System.out::println);
  }

}
