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

    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;

  }
}
