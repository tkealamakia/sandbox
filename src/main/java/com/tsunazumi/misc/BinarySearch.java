package com.tsunazumi.misc;

public class BinarySearch {
  public static void main(String[] args) {
    int[] haystack = {1,3,5,6,9,22,31};
    boolean result = isNeedleInHaystack(31, haystack);
    System.out.println(result);
  }

  private static boolean isNeedleInHaystack(int needle, int[] haystack) {
    int lo = 0;
    int hi = haystack.length;

    do {
      int mid = lo + (hi - lo)/2;
      if (haystack[mid] == needle) {
        return true;
      }
      if (haystack[mid] > needle) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    } while (lo < hi);

    return false;
  }
}
