package com.tsunazumi.dsa.leetcode;

import com.tsunazumi.dsa.structures.ListNode;
import com.tsunazumi.dsa.structures.SinglyLinkedList;

public class DeleteNode {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.insertNode(1);
    list.insertNode(2);
    list.insertNode(3);
    ListNode result = deleteAt(list, 3);
    list.print(result);
    ;
  }

  private static ListNode deleteAt(SinglyLinkedList list, int i) {
    ListNode current = list.head;
    ListNode prev = null;
    while (current != null) {
      if (current.val == i) {
        if (prev != null) {
          prev.next = current.next;
        } else {
          list.head = current.next;
        }
      }
      prev = current;
      current = current.next;
    }
    return list.head;
  }
}
