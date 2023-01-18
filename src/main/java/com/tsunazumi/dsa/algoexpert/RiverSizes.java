package com.tsunazumi.dsa.algoexpert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RiverSizes {
  public static void main(String[] args) {
    int[] one = {1,0,0,1,0};
    int[] two = {1,0,1,0,0};
    int[] thr = {0,0,1,0,1};
    int[] fou = {1,0,1,0,1};
    int[] fiv = {1,0,1,1,0};

    int[][] matrix = {one,two,thr,fou,fiv};
    List<Integer> integers = riverSizes(matrix);
    System.out.println(integers);

  }

  public static int drillIn(int[][] matrix, int[][] visited, int i, int j, int count) {
    if (visited[i][j] == 0) {
      // mark as visited
      visited[i][j] = 1;
      // check if it's a 1
      if (matrix[i][j] == 1) {
        // check the adjacent values, recurse
        if (i+1 <= matrix.length-1) {
          return drillIn(matrix, visited, i + 1, j, count) + 1;
        }
        if (j+1 <= matrix[i].length-1) {
          return drillIn(matrix, visited, i, j + 1, count) + 1;
        }
      }
    }
    return count;
  }

  public static List<Integer> riverSizes(int[][] matrix) {
    int[][] visited = new int[matrix.length][matrix[0].length];
    List<Integer> result = new ArrayList<>();

    // go to each value
    for (int i=0; i<matrix.length; i++) {
      for (int j=0; j<matrix[i].length; j++) {
        int value = drillIn(matrix, visited, i, j, 0);
        if (value != 0) {
          result.add(value);
        }
      }
    }
    return result.stream().sorted().collect(Collectors.toList());
  }
}
