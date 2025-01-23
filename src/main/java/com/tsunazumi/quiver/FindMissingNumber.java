package com.tsunazumi.quiver;

// Find the missing number in an array of integers from 1 to n.
public class FindMissingNumber {
  public static void main(String[] args) {
    int[] nums = {3,1,2,7,6,5};
    int result = findMissingNumber(nums);
    System.out.println(result);
  }

  public static int findMissingNumber(int[] nums) {
    // Get the length that it should be if adding the missing number
    int n = nums.length + 1;
    // magic formula
    int expectedSum = (n * (n + 1)) / 2;

    int actualSum = 0;
    for (int num : nums) {
      actualSum += num;
    }

    return expectedSum - actualSum;

  }
}
