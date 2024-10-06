package com.tsunazumi.scratch;

import com.tsunazumi.dsa.structures.ListNode;
import com.tsunazumi.dsa.structures.SinglyLinkedList;

public class DetectLinkedListCycle {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    ListNode node = new ListNode(1);
    list.addNode(node);
    list.insertNode(2);
    list.insertNode(3);
    list.addNode(node);
    System.out.println(detectCycleFloyd(list.head));
  }

  public static boolean detectCycle(ListNode head) {
    return false;
  }

  public static boolean detectCycleFloyd(ListNode head) {
    return false;
  }
}

