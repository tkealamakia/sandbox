package com.tsunazumi.quiver;

import java.util.Arrays;

// Find the missing number in an array of integers from 1 to n.
public class FindMissingNumber {
  public static void main(String[] args) {
    int[] nums = {3,1,2,7,6,5};
    int result = findMissingNumber(nums);
    System.out.println(result);
  }

  public static int findMissingNumber(int[] nums) {
    // magic formula
    int expectedSum = ((nums.length + 1) * (nums.length + 2)) / 2;

    int actualSum = Arrays.stream(nums).sum();

    return expectedSum - actualSum;

  }
}
