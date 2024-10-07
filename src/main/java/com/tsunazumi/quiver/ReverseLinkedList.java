package com.tsunazumi.quiver;

import com.tsunazumi.structures.SinglyLinkedList;
import com.tsunazumi.structures.ListNode;

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
      ListNode next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;

  }
}
