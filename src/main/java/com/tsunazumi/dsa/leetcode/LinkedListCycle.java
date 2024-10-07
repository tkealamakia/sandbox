package com.tsunazumi.dsa.leetcode;

import com.tsunazumi.structures.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

  public static void main(String[] args) {
    ListNode zero = new ListNode(3);
    ListNode one = new ListNode(2);
    ListNode two = new ListNode(0);
    ListNode three = new ListNode(-4);

    zero.next = one;
    zero.next.next = two;
    zero.next.next.next = three;
    zero.next.next.next.next = one;

    System.out.println(hasCycle(zero));
  }

  public static boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    ListNode current = head;
    Set<ListNode> set = new HashSet<>();
    while (current.next != null) {
      if (set.contains(current)) {
        return true;
      }
      set.add(current);
      current = current.next;
    }
    return false;
  }
}
