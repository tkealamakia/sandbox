package com.tsunazumi.algorithms.structures;

public class SinglyLinkedList {
  public SinglyLinkedListNode head;
  public SinglyLinkedListNode tail;

  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void insertNode(int nodeData) {
    SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

    if (this.head == null) {
      this.head = node;
    } else {
      this.tail.next = node;
    }

    this.tail = node;
  }

  public void print(SinglyLinkedListNode node) {
    if (node == null) {
      return;
    }
    System.out.println(node.data);
    print(node.next);
  }
}
