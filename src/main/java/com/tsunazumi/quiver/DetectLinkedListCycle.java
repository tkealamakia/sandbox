package com.tsunazumi.quiver;

import com.tsunazumi.structures.ListNode;
import com.tsunazumi.structures.SinglyLinkedList;

import java.util.HashSet;
import java.util.Set;

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

  public static boolean detectCycleFloyd(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next !=null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true;
      }

    }
    return false;
  }
}

