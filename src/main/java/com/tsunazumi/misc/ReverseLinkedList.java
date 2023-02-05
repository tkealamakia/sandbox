package com.tsunazumi.misc;

import com.tsunazumi.dsa.structures.SinglyLinkedList;
import com.tsunazumi.dsa.structures.ListNode;

public class ReverseLinkedList {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.insertNode(1);
    list.insertNode(2);
    list.insertNode(3);
    ListNode result = reverseList(list.head);
    list.print(result);
  }

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;

    while (current != null) {
      // Save the next node
      ListNode next = current.next;
      // make the current next the previous
      current.next = prev;
      // make the previous the current
      prev = current;
      // move the current to the next;
      current = next;
    }
    return prev;

  }
}
