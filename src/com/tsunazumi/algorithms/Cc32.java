package com.tsunazumi.algorithms;

import java.util.Stack;

public class Cc32 extends Stack<Integer> {
  Stack<Integer> mins;
  public Cc32() {
    mins = new Stack<Integer>();
  }
  
  public void push(int value) {
    if (value <= min()) {
      mins.push(value);
    }
    super.push(value);
  }
  
  public Integer pop() {
    int value = super.pop();
    if (value == min()) {
      mins.pop();
    }
    return value;
  }
  
  public int min() {
    if (mins.isEmpty()) {
      return Integer.MAX_VALUE;
    } else {
      return mins.peek();
    }
  }

  public static void main(String[] args) {
    Cc32 stack = new Cc32();
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(1);
    stack.push(8);
    System.out.println(stack.min());
  }

}
