package com.tsunazumi.dsa.crackingCodingInterview;

public class Cc18 {

  public static void main(String[] args) {
    int[][] matrix = {
        {1,2,3,4},
        {1,0,3,3},
        {1,4,3,4},
        {1,2,3,4}
    };
    
    new Cc18().setZeros(matrix);

  }
  
  void nullifyRow(int[][] matrix, int row) {
    for (int j = 0; j < matrix[0].length; j++) {
      matrix[row][j] = 0;
    }
  }

  void nullifyColumn(int[][] matrix, int col) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][col] = 0;
    }
  }
  
  void setZeros(int [][] matrix) {
    boolean rowHasZero = false;
    boolean colHasZero = false;
    
    for (int j = 0; j < matrix[0].length; j++) {
      if (matrix[0][j] == 0) {
        rowHasZero = true;
        break;
      }
    }

    for (int i = 0; i < matrix[0].length; i++) {
      if (matrix[i][0] == 0) {
        colHasZero = true;
        break;
      }
    }
    
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; i < matrix[0].length; i++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }
    
    for (int i = 1; i < matrix.length; i++) {
      if (matrix[i][0] == 0) {
        nullifyRow(matrix, i);
      }
    }

    for (int j = 1; j < matrix[0].length; j++) {
      if (matrix[0][j] == 0) {
        nullifyColumn(matrix, j);
      }
    }
    
    if (rowHasZero) {
      nullifyRow(matrix, 0);
    }
    
    if (colHasZero) {
      nullifyColumn(matrix, 0);
    }

  }

}
