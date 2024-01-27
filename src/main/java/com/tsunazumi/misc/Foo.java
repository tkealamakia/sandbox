package com.tsunazumi.misc;

import java.util.*;

public class Foo {
  public static void main(String [] args) throws InterruptedException {
    String foo = "hi";
    String bar = "";
    System.out.println(Objects.equals(foo, bar));
    String binaryString = Integer.toBinaryString(100);
    System.out.println( binaryString);
  }
}
