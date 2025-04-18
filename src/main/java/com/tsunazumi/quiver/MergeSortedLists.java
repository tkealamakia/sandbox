package com.tsunazumi.quiver;

import com.tsunazumi.structures.ListNode;

public class MergeSortedLists {
  public static void main(String[] args) {
    ListNode list1 = new ListNode(5);
    ListNode list7 = new ListNode(7);
    ListNode list9 = new ListNode(9);
    ListNode list31 = new ListNode(31);
    ListNode list32 = new ListNode(32);
    list31.next = list32;
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
    // Create a placeholder so we can refer back to the beginning
    ListNode placeholder = new ListNode(0);
    ListNode current = placeholder;

    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        current.next = list1;
        list1 = list1.next;
      } else {
        current.next = list2;
        list2 = list2.next;
      }
      current = current.next;
    }
    // At this point we just add the tail of what is left.
    // No need to loop
    if (list1 != null) {
      current.next = list1;
    } else {
      current.next = list2;
    }
    // Reach back to the beginning with our placeholder
    return placeholder.next;
  }
}
