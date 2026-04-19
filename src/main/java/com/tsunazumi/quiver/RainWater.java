package com.tsunazumi.quiver;

public class RainWater {
  public static void main(String[] args) {
    int [] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int result = trap(height);
    System.out.println(result);
  }

  private static int trap(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxLeft = 0;
    int maxRight = 0;
    int water = 0;

    while (left < right) {
      // Start on the short side
      if (height[left] <= height[right]) {
        // If the height is greater than max
        // make it the new max
        if (height[left] >= maxLeft) {
          maxLeft = height[left];
        // else calculate water tapped by subtracting
        // maxLeft from the current left
        } else {
          water += maxLeft - height[left];
        }
        left++;
      } else {
        if (height[right] >= maxRight) {
          maxRight = height[right];
        } else {
          water += maxRight - height[right];
        }
        right--;
      }

    }
    return water;
  }
}
