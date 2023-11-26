package com.tsunazumi.scratch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromTest {
  @Test
  public void isPalindrome() {
    Palindrome palindrome = new Palindrome();
    String testValue = "racecar";
    boolean result = palindrome.isPalindrome(testValue);
    assertTrue(result);
  }

  @Test
  public void isNotPalindrome() {
    Palindrome palindrome = new Palindrome();
    String testValue = "hello";
    boolean result = palindrome.isPalindrome(testValue);
    assertFalse(result);
  }

  @Test
  public void nullValuePassedIn() {
    Palindrome palindrome = new Palindrome();
    String testValue = null;
    boolean result = palindrome.isPalindrome(testValue);
    assertFalse(result);
  }

  @Test
  public void emptyStringValuePassedIn() {
    Palindrome palindrome = new Palindrome();
    String testValue = "";
    boolean result = palindrome.isPalindrome(testValue);
    assertFalse(result);
  }

  @Test
  public void oneValueStringPassedIn() {
    Palindrome palindrome = new Palindrome();
    String testValue = "r";
    boolean result = palindrome.isPalindrome(testValue);
    assertTrue(result);
  }
}
