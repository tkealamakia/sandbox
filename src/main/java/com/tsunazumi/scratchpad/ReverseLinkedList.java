package com.tsunazumi.scratchpad;

import com.tsunazumi.structures.ListNode;
import com.tsunazumi.structures.SinglyLinkedList;


public class ReverseLinkedList {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.insertNode(1);
    list.insertNode(2);
    list.insertNode(3);
    list.insertNode(4);
    ListNode result = reverse(list.head);
    list.print(result);
  }

  public static ListNode reverse(ListNode head) {
    return null;
  }
}
