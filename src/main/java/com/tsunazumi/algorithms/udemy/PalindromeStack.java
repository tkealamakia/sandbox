package com.tsunazumi.algorithms.udemy;

import java.util.LinkedList;

public class PalindromeStack {
  public static void main(String[] args) {
    String word = "@@##racecar#@#@$";
    StringBuilder sanitizedWord = new StringBuilder();

    LinkedList<Character> list = new LinkedList<>();
    for (Character c : word.toLowerCase().toCharArray()) {
      if (c >='a' && c <= 'z') {
        list.push(c);
        sanitizedWord.append(c);
      }
    }

    String wordFromStack = "";
    int size = list.size();
    while (size > 0) {
      wordFromStack += list.pop();
      size--;
    }

    System.out.println(wordFromStack);
    if (wordFromStack.equals(sanitizedWord.toString())) {
      System.out.println("This is a palindrome");
    }
  }
}
