package com.tsunazumi.dsa.hackerrank.datastructures.archive;

class SinglyLinkedList {
  static Node head;

  static class Node {
    public int data;
    public Node next;

    public Node(int d){
      data = d;
      next = null;
    }
  }

  public static Node reverse(Node node) {
    Node prev = null;
    Node current = node;
    Node next = null;
    while (current != null) {
      next = current.next;
      // The actual reverse pointing
      current.next = prev;
      // Move current to prev
      prev = current;
      // Move next to current
      current = next;
    }
    node = prev;
    return node;
  }

  static void printList(Node node) {
    while (node != null) {
      System.out.println(node.data);
      node = node.next;
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.head = new Node(1);
    list.head.next = new Node(2);
    list.head.next.next = new Node(3);
    list.head.next.next.next = new Node(4);
    list.head.next.next.next.next = new Node(5);
    printList(list.head);
    head = list.reverse(head);
    printList(head);

  }
}