package com.tsunazumi.algorithms.hackerrank.datastructures.archive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SinglyLinkedListNode {
  int data;
  SinglyLinkedListNode next;
  public SinglyLinkedListNode(int nodeData) {
    this.data = nodeData;
    this.next = null;
  }
}

public class InsertTail {

  static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

    if (head == null) {
      head = new SinglyLinkedListNode(data);
      head.next = null;
      return head;
    }

    //recursively navigate list
    head.next = insertNodeAtTail(head.next, data);
    return head;

  }

  static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode node, int data) {
    if (node == null) {
      node = new SinglyLinkedListNode(data);
      return node;
    } else {
      SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
      newNode.next = node;
      return newNode;
    }

  }

  public static void main(String[] args) {
//    SinglyLinkedListNode  node = insertNodeAtTail(null, 141);
//    insertNodeAtTail(node, 5);
    SinglyLinkedListNode  node = insertNodeAtHead(null, 383);
    node = insertNodeAtHead(node, 484);
    node = insertNodeAtHead(node, 392);
    node = insertNodeAtHead(node, 975);
    node = insertNodeAtHead(node, 321);

    List foobar = Arrays.asList("bobo", "foo", "bar");
    foobar.forEach(s -> System.out.println(s));
    Object foo = foobar.stream()
        .filter(s -> !s.equals("foo"))
        .collect(Collectors.toList());
    System.out.println(foo);


  }
}
