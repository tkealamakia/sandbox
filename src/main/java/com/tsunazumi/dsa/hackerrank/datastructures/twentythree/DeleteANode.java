package com.tsunazumi.dsa.hackerrank.datastructures.twentythree;

import com.tsunazumi.dsa.structures.SinglyLinkedList;
import com.tsunazumi.dsa.structures.SinglyLinkedListNode;

public class DeleteANode {

  public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.insertNode(11);
    sll.insertNode(12);
    sll.insertNode(8);
    sll.insertNode(18);
    sll.insertNode(16);
    sll.insertNode(5);
    sll.insertNode(18);
    sll.insertNode(0);

    sll.print(sll.head);

    SinglyLinkedListNode result = deleteNode(sll.head, 3);

    System.out.println("done");


  }
  public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    if (position == 0) {
      return llist.next;
    }
    int currentPosition = 0;
    if (llist == null) {
      return null;
    }

    SinglyLinkedListNode head = llist;
    SinglyLinkedListNode previousNode = llist;
    SinglyLinkedListNode current = llist;

    while (llist.next != null) {
      if (currentPosition == position && current.next != null) {
        //point previousNode to current next
        previousNode.next = current.next;
        return head;
      }
      currentPosition++;
      previousNode = current;
      current = current.next;
    }

    return null;
  }
}
