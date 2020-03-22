package com.tsunazumi.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoDim {
  public static void main(String[] args) {
    int[][] twoDim = {{ -1,-1,0,-9,-2,-2 },
                      { -2,-1,-6,-8,-2,-5 },
                      { -1,-1,-1,-2,-3,-4 },
                      { -1,-9,-2,-4,-4,-5 },
                      { -7,-3,-3,-2,-9,-9 },
                      { -1,-3,-1,-2,-4,-5 }};
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < twoDim.length; i++) {
      for (int j = 0; j < twoDim[i].length; j++) {
        if (i != 0 && j != 0 && i != twoDim.length - 1 && j != twoDim[i].length - 1) {
          int sum = 0;
          sum += twoDim[i][j];
          sum += twoDim[i-1][j];
          sum += twoDim[i-1][j+1];
          sum += twoDim[i-1][j-1];
          sum += twoDim[i+1][j];
          sum += twoDim[i+1][j+1];
          sum += twoDim[i+1][j-1];
          list.add(sum);
        }
      }
    }
    Collections.sort(list);
    for (int i : list) {
      System.out.println(i);
    }
    System.out.println(list.get(list.size()-1));
  }
}
