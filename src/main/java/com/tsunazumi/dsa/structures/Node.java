package com.tsunazumi.dsa.structures;

public class Node {
  public Node(int value) {
    this.value = value;
  }
  int value;
  Node next;
  Node below;
  Node above;

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public String toString() {
    return String.valueOf(value);
  }
}
