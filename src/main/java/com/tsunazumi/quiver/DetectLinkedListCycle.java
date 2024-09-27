package com.tsunazumi.quiver;

import com.tsunazumi.dsa.structures.ListNode;
import com.tsunazumi.dsa.structures.SinglyLinkedList;

import java.util.HashSet;
import java.util.List;
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

  public static boolean detectCycle(ListNode head) {
    Set<ListNode> set = new HashSet<>();
    while (head != null) {
      if (set.contains(head)) {
        return true;
      }
      set.add(head);
      head = head.next;
    }
    return false;
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

