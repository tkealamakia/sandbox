package com.tsunazumi.scratch;

import com.tsunazumi.dsa.structures.ListNode;
import com.tsunazumi.dsa.structures.SinglyLinkedList;

import java.util.LinkedList;
import java.util.List;


public class ReverseLinkedList {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.insertNode(1);
    list.insertNode(2);
    list.insertNode(3);
    ListNode result = reverse(list.head);
    list.print(result);
  }

  public static ListNode reverse(ListNode head) {
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
