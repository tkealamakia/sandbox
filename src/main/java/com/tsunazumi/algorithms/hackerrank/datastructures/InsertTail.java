package com.tsunazumi.algorithms.hackerrank.datastructures;

class SinglyLinkedListNode {
  int data;
  SinglyLinkedListNode next;
}

public class InsertTail {

  static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

    if (head == null) {
      head = new SinglyLinkedListNode();
      head.data = data;
      head.next = null;
      return head;
    }

    //recursively navigate list
    head.next = insertNodeAtTail(head.next, data);
    return head;

  }

  public static void main(String[] args) {
    SinglyLinkedListNode  node = insertNodeAtTail(null, 141);
    insertNodeAtTail(node, 5);
  }
}
