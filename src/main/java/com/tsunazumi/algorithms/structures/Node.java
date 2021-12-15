package com.tsunazumi.algorithms.structures;

public class Node {
  public Node(int value) {
    this.value = value;
  }
  int value;
  Node next;
  Node below;
  Node above;
  public String toString() {
    return String.valueOf(value);
  }
}
