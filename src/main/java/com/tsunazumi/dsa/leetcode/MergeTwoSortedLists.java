package com.tsunazumi.dsa.leetcode;

import com.tsunazumi.dsa.structures.SinglyLinkedList;
import com.tsunazumi.dsa.structures.SinglyLinkedListNode;

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

  public static SinglyLinkedListNode mergeTwoLists(SinglyLinkedListNode list1, SinglyLinkedListNode list2) {

    List<Integer> list = new ArrayList<>();
    while (list1 != null) {
      list.add(list1.data);
      list1 = list1.next;
    }

    while (list2 != null) {
      list.add(list2.data);
      list2 = list2.next;
    }

    Collections.sort(list);

    SinglyLinkedListNode head = null;
    SinglyLinkedListNode originHead = head;

    for (int i : list) {
      if (head == null) {
        head = new SinglyLinkedListNode(i);
        originHead = head;
      } else {
        head.next = new SinglyLinkedListNode(i);
        head = head.next;
      }
    }
    return originHead;

  }







}
