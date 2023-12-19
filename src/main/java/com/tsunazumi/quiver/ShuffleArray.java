package com.tsunazumi.quiver;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
  int[] nums;
  int[] original;
  Random random = new Random();

  public ShuffleArray(int[] nums) {
    this.nums = nums;
    this.original = Arrays.copyOf(nums, nums.length);
  }

  public int[] reset() {
    nums = Arrays.copyOf(original,original.length);
    return nums;
  }

  public int[] shuffle() {
    for (int i = nums.length - 1; i > 0; i--) {
      int j = random.nextInt(i + 1);
      swap(nums, i, j);
    }
    return nums;
  }

  private void swap(int[] shuffled, int i, int j) {
    int temp = shuffled[i];
    shuffled[i] = shuffled[j];
    shuffled[j] = temp;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {1,2,3};
    ShuffleArray sa = new ShuffleArray(nums);
    int[] shuffled = sa.shuffle();
    print(shuffled);
    sa.reset();
    System.out.println();
    int[] shuffled2 = sa.shuffle();
    print(shuffled2);
  }

  static void print(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
}
