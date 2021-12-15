package com.tsunazumi.hackerrank;

import java.util.Arrays;
import java.util.List;

public class BonAppetite {
  public static void main(String[] args) {
    List<Integer> bill = Arrays.asList(3, 10, 2, 9);
    int itemNotEaten = 1;
    int amountCharged = 7;
    bonAppetit(bill, itemNotEaten, amountCharged);
  }

  // Complete the bonAppetit function below.
  static void bonAppetit(List<Integer> bill, int k, int b) {
    // Sum the items except the notEaten one
    int size = bill.size();
    int total = 0;
    for (int i = 0; i < size; i++) {
      if (i == k) {
        continue;
      }
      total += bill.get(i);
    }

    // Divide by 2
    total /= 2;

    // If amountCharged > result print the difference
    // else pring bonappetite
    if (b > total) {
      System.out.println(b - total);
    } else {
      System.out.println("Bon Appetit");
    }

  }
}
