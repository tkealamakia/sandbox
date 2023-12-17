package com.tsunazumi.quiver;

public class BinarySearch {
  public static void main(String[] args) {
    int[] haystack = {1,3,5,6,9,22,31};
    boolean result = isNeedleInHaystack(5, haystack);
    System.out.println(result);
  }

  private static boolean isNeedleInHaystack(int needle, int[] haystack) {
    if (haystack.length == 0) {
      return false;
    }
    int low = 0;
    int high = haystack.length;

    while (low < high) {
      int mid = low + ((high - low) / 2);
      if (haystack[mid] == needle) {
        return true;
      }
      if (haystack[mid] > needle) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return false;

  }
}
