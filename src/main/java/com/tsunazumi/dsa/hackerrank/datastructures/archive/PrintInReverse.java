package com.tsunazumi.dsa.hackerrank.datastructures.archive;

import java.util.Stack;

public class PrintInReverse {

  static class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
      this.data = nodeData;
      this.next = null;
    }
  }

  static class SinglyLinkedList {
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
  }

  public static void main(String[] args) {
    SinglyLinkedList llist = new SinglyLinkedList();
    llist.insertNode(1);
    llist.insertNode(2);
    llist.insertNode(3);

    reversePrint(llist.head);

  }

  public static void reversePrint (SinglyLinkedListNode llist) {
    Stack<Integer> stack = new Stack<>();
    do {
      stack.push(llist.data);
      llist = llist.next;
    } while (llist != null);

    while (!stack.empty()) {
      System.out.println(stack.pop());
    }

  }
}
