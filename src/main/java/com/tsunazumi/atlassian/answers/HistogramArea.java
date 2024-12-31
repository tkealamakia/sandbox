package com.tsunazumi.atlassian.answers;

// Find the largest rectangular area possible in a given histogram
// where the largest rectangle can be made of a number of contiguous bars
// whose heights are given in an array.
// For simplicity, assume that all bars have the same width and the width is 1 unit.
public class HistogramArea {
  public static void main(String[] args) {
    int[] hist = {60,20,50,40,10,50,60};
    System.out.println(compute(hist));

  }

  public static int compute(int[] hist) {
    int low = hist[0];
    int sliding = hist[0];

    for (int i = 1; i < hist.length; i++) {
      if (hist[i] < low) {
        low = hist[i];
      }
      System.out.println(low);
    }

    return 0;
  }
}
