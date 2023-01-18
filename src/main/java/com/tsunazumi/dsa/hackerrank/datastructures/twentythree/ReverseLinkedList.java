package com.tsunazumi.dsa.hackerrank.datastructures.twentythree;

import com.tsunazumi.dsa.structures.SinglyLinkedList;
import com.tsunazumi.dsa.structures.SinglyLinkedListNode;

import java.util.Stack;

public class ReverseLinkedList {

  public static void main(String[] args) {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.insertNode(1);
    linkedList.insertNode(2);
    linkedList.insertNode(3);
    SinglyLinkedListNode head = linkedList.head;
    linkedList.print(head);

    SinglyLinkedListNode reversed = reverse(head);
    linkedList.print(reversed);

  }

  public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // push the items onto a stack 3,2,1
    // create a new linked list by popping items off the stack
    Stack<Integer> stack = new Stack<>();
    stack.push(llist.data);
    while (llist.next != null) {
      llist = llist.next;
      stack.push(llist.data);
    }

    SinglyLinkedList sll = new SinglyLinkedList();
    while (!stack.isEmpty()) {
      sll.insertNode(stack.pop());
    }

    return sll.head;
  }
}
