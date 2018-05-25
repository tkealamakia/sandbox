package com.tsunazumi.algorithms.crackingCodingInterview;

import java.util.Stack;

public class Cc35 {

  public static void main(String[] args) {
    Stack<Integer> raw = new Stack<Integer>();
    raw.push(1);
    raw.push(3);
    raw.push(8);
    raw.push(12);
    System.out.println(raw);
    
    sort(raw);
    System.out.println(raw);
    


  }
  
  public static void sort(Stack<Integer> raw) {
    Stack<Integer> sorted = new Stack<Integer>();
    while (!raw.isEmpty()) {
      // Insert each element in s in sorted order into r.
      int tmp = raw.pop();
      while (!sorted.isEmpty() && sorted.peek() > tmp) {
        raw.push(sorted.pop());
      }
      sorted.push(tmp);
    }
    
    // Copy the elements from r back into s
    while (!sorted.isEmpty()) {
      raw.push(sorted.pop());
    }
  }
}
