package com.tsunazumi.dsa.theprimagen;

public class BinarySearch {
  public static void main(String[] args) {
    boolean result = search(70, new int[] {1,3,5,10,16,70});
    System.out.println(result);
  }

  public static boolean search(int needle, int[] nums) {
    int low = 0;
    int high = nums.length;

    do {
      int mid = low + (high - low) / 2;
      int curVal = nums[mid];
      if (curVal == needle) {
        return true;
      } else if (curVal > needle) {
        high = mid;
      } else {
        low = mid + 1;
      }
    } while (low < high);

    return false;

  }
}
