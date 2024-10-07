package com.tsunazumi.dsa.leetcode;

import com.tsunazumi.structures.SinglyLinkedList;
import com.tsunazumi.structures.ListNode;

import java.util.*;

public class MergeTwoSortedLists {
  public static void main(String[] args) {
    SinglyLinkedList foo = new SinglyLinkedList();
    foo.insertNode(1);
    foo.insertNode(2);
    foo.insertNode(4);

    SinglyLinkedList bar = new SinglyLinkedList();
    bar.insertNode(1);
    bar.insertNode(3);
    bar.insertNode(4);

    mergeTwoLists(foo.head, bar.head);
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    List<Integer> list = new ArrayList<>();
    while (list1 != null) {
      list.add(list1.val);
      list1 = list1.next;
    }

    while (list2 != null) {
      list.add(list2.val);
      list2 = list2.next;
    }

    Collections.sort(list);

    ListNode head = null;
    ListNode originHead = head;

    for (int i : list) {
      if (head == null) {
        head = new ListNode(i);
        originHead = head;
      } else {
        head.next = new ListNode(i);
        head = head.next;
      }
    }
    return originHead;

  }







}
