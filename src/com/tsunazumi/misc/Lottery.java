package com.tsunazumi.misc;

import java.util.Random;

public class Lottery {
  public static void main(String[] args) {
    Random rand = new Random();
    int entries = 1000000;
    int value = rand.nextInt(entries);
    int count = 0;
    boolean numberIsFound = false;

    while (!numberIsFound) {
      if (rand.nextInt(entries) == value) {
        break;
      }
      count++;
    }
    System.out.println("Guessed after " + count + " tries.");
  }
}
