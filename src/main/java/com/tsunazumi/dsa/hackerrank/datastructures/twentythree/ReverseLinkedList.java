package com.tsunazumi.dsa.hackerrank.datastructures.twentythree;

import com.tsunazumi.structures.SinglyLinkedList;
import com.tsunazumi.structures.ListNode;

import java.util.Stack;

public class ReverseLinkedList {

  public static void main(String[] args) {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.insertNode(1);
    linkedList.insertNode(2);
    linkedList.insertNode(3);
    ListNode head = linkedList.head;
    linkedList.print(head);

    ListNode reversed = reverse(head);
    linkedList.print(reversed);

  }

  public static ListNode reverse(ListNode llist) {
    // push the items onto a stack 3,2,1
    // create a new linked list by popping items off the stack
    Stack<Integer> stack = new Stack<>();
    stack.push(llist.val);
    while (llist.next != null) {
      llist = llist.next;
      stack.push(llist.val);
    }

    SinglyLinkedList sll = new SinglyLinkedList();
    while (!stack.isEmpty()) {
      sll.insertNode(stack.pop());
    }

    return sll.head;
  }
}
