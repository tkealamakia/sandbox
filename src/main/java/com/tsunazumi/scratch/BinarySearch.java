package com.tsunazumi.scratch;

public class BinarySearch {
  public static void main(String[] args) {
    int[] haystack = {1,3,5,6,9,22,31};
    boolean result = isNeedleInHaystack(22, haystack);
    System.out.println(result);
  }

  static boolean isNeedleInHaystack(int needle, int[] haystack) {
    int low = 0;
    int high = haystack.length;

    while (low < high) {
      int mid = low + ((high - low) / 2);
      if (haystack[mid] == needle) {
        return true;
      }
      if (needle > haystack[mid]) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return false;
  }
}
