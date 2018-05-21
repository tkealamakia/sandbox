package com.tsunazumi.misc;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    
    for (int i=0; i<arr.length/2; i++) {
      // save the first item
      int temp = arr[i];
      // make first item the last item
      arr[i] = arr[arr.length-i-1];
      // make last item the first item
      arr[arr.length-i-1] = temp;
    }
    System.out.println(arr);

  }

}
