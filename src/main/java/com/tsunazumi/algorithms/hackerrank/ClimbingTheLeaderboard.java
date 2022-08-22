package com.tsunazumi.algorithms.hackerrank;

import java.util.*;

public class ClimbingTheLeaderboard {
  public static void main(String[] args) {
    List<Integer> scores = Arrays.asList( 100, 100, 50, 40, 40, 20, 10);
    List<Integer> alice = Arrays.asList(5,25,50,120);
    List<Integer> results = climbingLeaderboard(scores, alice);
    for (Integer i : results) {
      System.out.println(i);
    }

  }
  public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    int[] scores = new int[ranked.size()];
    int[] person = new int[player.size()];
    for (int i = 0; i< scores.length; i++) {
      scores[i] = ranked.get(i);
    }
    for (int i = 0; i< person.length; i++) {
      person[i] = player.get(i);
    }
    int [] foo = climbingLeaderboardSlow(scores, person);
    List<Integer> results = new ArrayList<>();
    for (int i = 0; i<foo.length; i++) {
      results.add(foo[i]);
    }
    return results;
  }

  static int[] climbingLeaderboardSlow(int[] scores, int[] alice) {
    //eliminate dups
    Set<Integer> set = new LinkedHashSet<>();
    for (int i=0; i< scores.length; i++) {
      set.add(scores[i]);
    }
    Integer[] arr = new Integer[set.size()];
    int x = 0;
    for (Integer i : set) {
      arr[x++] = i;
    }
    int[] intArr = new int[arr.length];
    for (int i=0; i< arr.length; i++) {
      intArr[i] = arr[i];
    }

    int[] results = new int[alice.length];
    for (int i=0; i < alice.length; i++) {
      for (int j=0; j < intArr.length; j++) {
        int target = alice[i];
        int current = intArr[j];
        if (target >= current) {
          results[i] = j + 1;
          break;
        }
        if (target < current && j == intArr.length -1)
          results[i] = intArr.length + 1;
        if (target < current) {
          continue;
        }
      }

    }
    return results;
  }

  static int findPosition(int score, int[] scores, int position) {
    int index = (int)Math.floor((double)(scores.length / 2));
    if (scores.length == 1) {
      return position;
    }

    int mid = scores[index];

    if (score == mid) {
      return position;
    } else  if (score < mid) {
      // search right
      // Create a new right array
      int[] newArray = new int[scores.length - index];
      for (int i=0; i < newArray.length; i++) {
        newArray[i] = scores[index+i];
      }
      findPosition(score, newArray, index + position);
      return position + index;
    } else {
      // search left
      // Create a new left array
      int[] newArray = new int[scores.length - index];
      for (int i=0; i < newArray.length; i++) {
        newArray[i] = scores[i];
      }
      findPosition(score, newArray, index - position);
      return position - index;
    }

  }

}
