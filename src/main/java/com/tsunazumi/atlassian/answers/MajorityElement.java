package com.tsunazumi.atlassian.answers;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  public static void main(String[] args) {
//    int[] nums = {3,3,4,2,4,4,2,4};
//    int[] nums = {3};
    int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
    int result = findMajorityElement(nums);


    if (result != -1) {
      System.out.println("The majority element is: " + result);
    } else {
      System.out.println("No majority element found.");
    }
  }

  public static int findMajorityElement(int[] nums) {
    Map<Integer, Integer> countMap = new HashMap<>();
    int majorityThreshold = nums.length / 2;

    // Count occurrences of each element
    for (int num : nums) {
      countMap.merge(num, 1, Integer::sum);
    }

    // Find the element that occurs more than `majorityThreshold` times
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
      if (entry.getValue() > majorityThreshold) {
        return entry.getKey();
      }
    }

    // Return -1 if no majority element is found
    return -1;
  }

}
