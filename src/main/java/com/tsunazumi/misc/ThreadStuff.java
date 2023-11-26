package com.tsunazumi.misc;

import java.util.Arrays;
import java.util.List;

public class ThreadStuff {
  public static void main(String[] args) {

    List<String> list = Arrays.asList("foo", "bar");
    list.add("kefe");
    list.forEach(f -> System.out.println(f));
//    Thread thread = new Thread(() -> {
//      int i = 0;
//      do {
//        System.out.println("thread 1");
//        i++;
//      } while (i < 100);
//    });
//    Thread thread2 = new Thread(() -> {
//      int i = 0;
//      do {
//        System.out.println("thread 2");
//        i++;
//      } while (i < 100);
//    });
//    thread.start();
//    thread2.start();
  }
}
