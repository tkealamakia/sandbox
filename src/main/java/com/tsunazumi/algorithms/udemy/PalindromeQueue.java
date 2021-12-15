package com.tsunazumi.algorithms.udemy;

import java.util.LinkedList;

public class PalindromeQueue {
  public static void main(String[] args) {
    String word = "@@##racecar#@#@$";

    LinkedList<Character> stack = new LinkedList<>();
    LinkedList<Character> queue = new LinkedList<>();
    for (Character c : word.toLowerCase().toCharArray()) {
      if (c >='a' && c <= 'z') {
        stack.push(c);
        queue.add(c);
      }
    }

    boolean allCharsEqual = true;
    int size = stack.size();
    while (size > 0) {
      if (!stack.pop().equals(queue.remove())) {
        allCharsEqual = false;
        break;
      }
      size--;
    }

    if (allCharsEqual) {
      System.out.println("This is a palindrome");
    }
  }
}
