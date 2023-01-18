package com.tsunazumi.dsa.crackingCodingInterview;

import java.util.Stack;

public class Cc34<T> {
  Stack<T> stackNewest, stackOldest;
  
  public Cc34() {
    stackNewest = new Stack<T>();
    stackOldest = new Stack<T>();
  }
  
  public int size() {
    return stackNewest.size() + stackOldest.size();
  }
  
  public void add(T value) {
    stackNewest.push(value);
  }
  
  private void shiftStacks() {
    if (stackOldest.isEmpty()) {
      while (!stackNewest.isEmpty()) {
        stackOldest.push(stackNewest.pop());
      }
    }
  }
  
  public T peek() {
    shiftStacks();
    return stackOldest.peek();
  }
  
  public T remove() {
    shiftStacks();
    return stackOldest.pop();
  }
  
  public static void main(String[] args) {
    Cc34<String> queue = new Cc34<>();
    queue.add("foo");
    queue.add("bar");
    queue.add("hey");
    queue.add("you");
    
    System.out.println(queue.size());
    System.out.println(queue.remove());

  }

}
