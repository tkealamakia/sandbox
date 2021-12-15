package com.tsunazumi.misc;

import java.util.ArrayList;
import java.util.Random;

public class DieParser {
  public static void main(String[] args) {
    char[] dice = "3d64d82d4".toCharArray();
    //char[] dice = "3d64d102d41d20".toCharArray();
    int position = 0;
    ArrayList<Integer> dieRolls = new ArrayList<>();
    while (position < dice.length) {
      char rolls = dice[position];
      position += 2;
      char die = dice[position];
      position++;
      dieRolls.add(calculate(Character.getNumericValue(rolls), Character.getNumericValue(die)));
    }
    printGranTotal(dieRolls);
  }

  private static void printGranTotal(ArrayList<Integer> dieRolls) {
    int grandTotal = 0;
    for (int roll : dieRolls) {
      grandTotal += roll;
    }
    System.out.println(grandTotal);
  }

  private static Integer calculate(int rolls, int dice) {
    int total = 0;
    Random rand = new Random();
    //for (;rolls > 0; rolls--) {
    while (rolls > 0) {
      total += rand.nextInt(dice);
      rolls--;
    }
    return total;
  }
}
