package com.tsunazumi.hackerrank;

import java.util.Set;
import java.util.TreeSet;

public class ClimbingTheLeaderboard {
  public static void main(String[] args) {
//    int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
//    int[] alice = { 5, 25, 50 , 120 };
    int[] scores = { 100, 90, 90, 80, 75, 60 };
    int[] alice = { 50, 65, 77, 90, 102 };
    int[] results = climbingLeaderboard(scores, alice);
    for (int i = 0; i < results.length; i++) {
      System.out.println(results[i]);
    }

  }

  static int[] climbingLeaderboardSlow(int[] scores, int[] alice) {
    //convert scores to ranking

//    int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
//    int[] alice = { 5, 25, 50 , 120 };
    int[] results = new int[alice.length];
    int timesSeenNumberTwice = 0;
    Outer:
    for (int i = alice.length-1; i >= 0; i--) {
      //loop through scores
      for (int j = 0; j < scores.length; j++) {
        if (j != 0 && scores[j] == scores[j-1]) {
          timesSeenNumberTwice++;
        }
        if (alice[i] > scores[j]) {
          results[i] = j+1-timesSeenNumberTwice;
          timesSeenNumberTwice = 0;
          continue Outer;
        }
        if (alice[i] == scores[j]) {
          results[i] = j+1-timesSeenNumberTwice;
          timesSeenNumberTwice = 0;
          continue Outer;
        }
        if (j == scores.length-1) {
          results[i] = scores.length+1-timesSeenNumberTwice;
        }
      }
    }
    return results;
  }

  static int[] climbingLeaderboard(int[] scores, int[] alice) {
//    int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
//    int[] alice = { 5, 25, 50 , 120 };
    int[] results = new int[alice.length];
    int timesSeenNumberTwice = 0;
    Outer:
    for (int i = alice.length-1; i >= 0; i--) {
      //loop through scores
      for (int j = 0; j < scores.length; j++) {
        if (j != 0 && scores[j] == scores[j-1]) {
          timesSeenNumberTwice++;
        }
        if (alice[i] > scores[j]) {
          results[i] = j+1-timesSeenNumberTwice;
          timesSeenNumberTwice = 0;
          continue Outer;
        }
        if (alice[i] == scores[j]) {
          results[i] = j+1-timesSeenNumberTwice;
          timesSeenNumberTwice = 0;
          continue Outer;
        }
        if (j == scores.length-1) {
          results[i] = scores.length+1-timesSeenNumberTwice;
        }
      }
    }
    return results;

  }
}
