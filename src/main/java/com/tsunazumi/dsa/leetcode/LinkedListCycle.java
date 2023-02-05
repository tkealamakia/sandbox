package com.tsunazumi.dsa.leetcode;

import com.tsunazumi.dsa.structures.ListNode;

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

    System.out.println(detectCycle(zero).val);
  }
  public static ListNode intersection(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return slow;
      }
    }
    return null;
  }

  public static ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    ListNode intersect = intersection(head);
    if (intersect == null) {
      return null;
    }
    ListNode start = head;
    while (intersect != start) {
      start = start.next;
      intersect = intersect.next;
    }
    return start;
  }
}
