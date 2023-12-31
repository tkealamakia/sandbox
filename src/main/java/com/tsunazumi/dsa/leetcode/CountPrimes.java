package com.tsunazumi.dsa.leetcode;

import java.util.Arrays;

public class CountPrimes {
  public static void main(String[] args) {
    System.out.println(countPrimes(20));
  }
  static int countPrimes(int n) {
    if (n <= 1) {
      return 0;
    }

    boolean[] primes = new boolean[n];
    Arrays.fill(primes, true); // Initially assume all numbers are prime

    for (int i = 2; i * i < n; i++) {
      if (primes[i]) {
        // Mark multiples of i as non-prime
        for (int j = i * i; j < n; j += i) {
          primes[j] = false;
        }
      }
    }

    // Count the remaining primes
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (primes[i]) {
        count++;
      }
    }

    return count;
  }
}
