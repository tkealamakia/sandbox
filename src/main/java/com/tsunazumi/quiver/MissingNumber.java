package com.tsunazumi.quiver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
  public static void main(String[] args) {
    int[] nums = new int[] {9,6,4,2,3,5,7,0,1};
//    int[] nums = new int[] {3,0,1};
//    int[] nums = new int[] {0,1};
    System.out.println(missingNumber(nums));
  }

  static int missingNumber(int[] nums) {
    int length = nums.length;
    Outer:
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i == nums[j]) {
          continue Outer;
        }
      }
      return i;

    }
    return length;

  }
}
