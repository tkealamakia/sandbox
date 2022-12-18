package com.tsunazumi.greencroft;

public class NumberChecker {
  public static void main(String[] args) throws InterruptedException {
    NumberChecker nc = new NumberChecker();

    // warm up period
    for (int i=1; i < 10000; i++) {
      nc.isPrime2(i);
    }

    Thread.sleep(5000);

    System.out.println("now measuring");
    long start = System.currentTimeMillis();

    for (int i=1; i < 50000; i++) {
      nc.isPrime2(i);
    }

    long end = System.currentTimeMillis();

    System.out.println("Time taken " + (end - start) + "ms");
  }

  public Boolean isPrime1(Integer testNumber) {
    for (Integer i = 2; i < testNumber; i++) {
      if (testNumber % i == 0) return false;
    }
    return true;
  }

  public Boolean isPrime2(int testNumber) {
    int maxToCheck = (int)Math.sqrt(testNumber);
    for (int i = 2; i <= maxToCheck; i++) {
      if (testNumber % i == 0) return false;
    }
    return true;
  }
}
