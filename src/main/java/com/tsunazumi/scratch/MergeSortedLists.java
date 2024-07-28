package com.tsunazumi.scratch;

import com.tsunazumi.dsa.structures.ListNode;

public class MergeSortedLists {
  public static void main(String[] args) {
    ListNode list1 = new ListNode(5);
    ListNode list7 = new ListNode(7);
    ListNode list9 = new ListNode(9);
    ListNode list31 = new ListNode(31);
    list9.next = list31;
    list7.next= list9;
    list1.next = list7;

    ListNode list2 = new ListNode(1);
    ListNode list3 = new ListNode(3);
    ListNode list30 = new ListNode(30);
    list3.next = list30;
    list2.next = list3;

    ListNode result = mergeSortedLists(list1, list2);
    while (result != null) {
      System.out.println(result.val);
      result = result.next;
    }

  }
  public static ListNode mergeSortedLists(ListNode list1, ListNode list2) {

    return null;
  }
}
