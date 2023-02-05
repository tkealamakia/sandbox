package com.tsunazumi.dsa.structures;

public class SinglyLinkedList {
  public ListNode head;
  public ListNode tail;

  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void insertNode(int nodeData) {
    ListNode node = new ListNode(nodeData);

    if (this.head == null) {
      this.head = node;
    } else {
      this.tail.next = node;
    }

    this.tail = node;
  }

  public void print(ListNode node) {
    if (node == null) {
      return;
    }
    System.out.println(node.val);
    print(node.next);
  }
}
