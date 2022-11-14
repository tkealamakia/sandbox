package com.tsunazumi.algorithms.hackerrank.datastructures;

class MergePoint {
  static Node head;

  static class Node {
    public int data;
    public Node next;

    public Node(int d){
      data = d;
      next = null;
    }
  }

  public static void main(String[] args) {
    Node node3 = new Node(3);

    Node node2 = new Node(2);
    node2.next = node3;
    Node node1 = new Node(1);
    node1.next = node2;

    Node node4 = new Node(4);
    node4.next = node3;

    System.out.println(findMergeNode(node1, node4));


  }

  static int findMergeNode(Node head1, Node head2) {

    if (head1 == head2) {
      return head1.data;
    }

    while (head1.next != null) {
      head1 = head1.next;
      if (head1 == head2) {
        return head1.data;
      }
      while (head2.next != null) {
        head2 = head2.next;
        if (head1 == head2) {
          return head1.data;
        }
      }
    }

    return 0;
  }
}