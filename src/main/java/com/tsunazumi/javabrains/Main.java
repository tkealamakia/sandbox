package com.tsunazumi.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Person> personList = Arrays.asList(
        new Person("Tom", "Kealamakia"),
        new Person("Dwight", "Schrute"),
        new Person("John", "Campbell")
    );

    Collections.sort(personList, (p1, p2) -> p1.getLast().compareTo(p2.getLast()));

    printList(personList);
    System.out.println();
    printConditionally(personList, p -> p.getLast().startsWith("K"));


  }

  public static <T> void printList(List<T> list) {
    list.forEach(e -> System.out.println(e));
  }

  public static void printConditionally(List<Person> list, Predicate<Person> p) {
    List<Person> fooList = list.stream()
        .filter(p)
        .collect(Collectors.toList());
    printList(fooList);
  }

}
