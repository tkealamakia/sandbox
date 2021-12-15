package com.tsunazumi.hackerrank;

public class NewYearChaos {
  public static void main(String[] args) {
    //int[] q = {2,1,5,3,4};
    //int[] q = {2,5,1,3,4};
    int[] q = {1,2,5,3,7,8,6,4};

    int swapCount = 0;
    for (int i = q.length - 1; i >=0; i--) {
      if (q[i] != i + 1) {
        if (((i - 1) >= 0) && q[i - 1] == (i + 1)) {
          swapCount++;
          swap(q, i ,i - 1);
        } else if (((i - 2) >= 0) && q[i -2] == (i + 1)) {
          swapCount += 2;
          swap(q, i - 2, i - 1);
          swap(q, i - 1, i);
        } else {
          System.out.println("Too chaotic");
          return;
        }

      }

    }
    System.out.println(swapCount);
  }

  private static void swap(int[] array, int i, int i1) {
    int temp = array[i];
    array[i] = array[i1];
    array[i1] = temp;
  }

}
