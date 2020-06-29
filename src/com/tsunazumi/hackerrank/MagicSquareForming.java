package com.tsunazumi.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MagicSquareForming {
  public static void main(String[] args) {
    //int[][] sq = { {5,3,4}, {1,5,8}, {6,4,2} };
    int[][] sq = { {4,9,2}, {3,5,7}, {8,1,5} };
    System.out.println(formingMagicSquare(sq));
  }

  static int formingMagicSquare(int[][] s) {
    int result = 0;
    int[] args = {
        s[0][0],
        s[0][1],
        s[0][2],
        s[1][0],
        s[1][1],
        s[1][2],
        s[2][0],
        s[2][1],
        s[2][2]
    };

    int[][] solutions = {
            {8, 1, 6, 3, 5, 7, 4, 9, 2},
            {6, 1, 8, 7, 5, 3, 2, 9, 4},
            {4, 9, 2, 3, 5, 7, 8, 1, 6},
            {2, 9, 4, 7, 5, 3, 6, 1, 8},
            {8, 3, 4, 1, 5, 9, 6, 7, 2},
            {4, 3, 8, 9, 5, 1, 2, 7, 6},
            {6, 7, 2, 1, 5, 9, 8, 3, 4},
            {2, 7, 6, 9, 5, 1, 4, 3, 8}
        };

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < solutions.length; i++) {
      int val = 0;
      for (int j = 0; j < solutions[i].length; j++) {
        val += Math.abs(args[j] - solutions[i][j]);
      }
      list.add(val);
    }

    int sorted = list.stream()
        .min(Comparator.naturalOrder()).get();

    return sorted;
  }
}
