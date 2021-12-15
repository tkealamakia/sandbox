package com.tsunazumi.algorithms.crackingCodingInterview;

import java.util.HashMap;
import java.util.Map;

public class Cc17 {

  public static void main(String[] args) {
    
    Map<String, String> foo = new HashMap<>();

    System.out.println(new Cc17().testSomething());
    int[][] matrix = {
        {1,2,3,4},
        {10,20,30,40},
        {100,200,300,400},
        {1000,2000,3000,4000}
    };
    
    System.out.println(new Cc17().rotate(matrix));

  }

  int testSomething() {
    try {
      String str = null;
      str.length();
    }
    catch (Exception e) {
      System.out.println("in exception");
    }
    return 1;
  }

  boolean rotate(int[][] matrix) {
    if (matrix.length == 0 || matrix.length != matrix[0].length) {
      return false;
    }
    int n = matrix.length; 
    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int top = matrix[first][i]; //save top
        
        // left -> top
        matrix[first][i] = matrix[last-offset][first];
        
        // bottom -> left
        matrix[last-offset][first] = matrix[last][last - offset];
        
        // right -> bottom
        matrix[last][last-offset] = matrix[i][last];
        
        // top -> right
        matrix[i][last] = top; // right <- saved top
      }
    }
    return true;
  }

}
