package com.tsunazumi.dsa.crackingCodingInterview;

public class Cc14 {

  public static void main(String[] args) {
    System.out.println(new Cc14().isPermutationOfPalindrome("Tact Coa"));
  }
  
  boolean isPermutationOfPalindrome(String phrase) {
    int[] table = buildCharFrequencyTable(phrase);
    return checkMaxOneOdd(table);
  }

  private boolean checkMaxOneOdd(int[] table) {
    boolean foundOdd = false;
    for (int count : table) {
      if (count % 2 == 1) {
        if (foundOdd) {
          return false;
        }
        foundOdd = true;
      }
    }
    return true;
  }

  private int[] buildCharFrequencyTable(String phrase) {
    int[] table = new int[Character.getNumericValue('z') - 
                          Character.getNumericValue('a') + 1];
    for (char c : phrase.toCharArray()) {
      int x = getCharNumber(c);
      if (x != -1) {
        table[x]++;
      }
    }
    return table;
  }

  private int getCharNumber(char c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);
    if (a <= val && val <= z) {
      return val - a;
    }
    return -1;
  }
  

}
