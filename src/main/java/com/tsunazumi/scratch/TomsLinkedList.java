package com.tsunazumi.scratch;

import com.tsunazumi.dsa.structures.ListNode;
import com.tsunazumi.dsa.structures.Node;

public class TomsLinkedList {
  ListNode head = null;
  ListNode tail = null;

  public TomsLinkedList(ListNode head) {
    this.head = head;
    this.tail = head;
  }

  public void append(ListNode node) {
    tail.next = node;
    tail = node;
  }

  public void prepend(ListNode node) {
    node.next = head;
    head = node;
  }

  public void insert(int index, ListNode node) {
    // start at head
    if (index == 0) {
      prepend(node);
      return;
    }
    int idx = 0;
    ListNode current = head;
    ListNode prev = null;
    while(current.next != null) {
      if (idx == index) {
        //insert it
        prev.next = node;
        node.next = current;
        break;
      }
      idx++;
      prev = current;
      current = current.next;
    }
    System.out.println(current.val);
  }

  public void remove(int index) {
    int idx = 0;
    ListNode current = head;
    ListNode prev = null;
    while (current != null) {
      if (idx == index) {
        //remove it
        prev.next = current.next;
        break;
      }
      idx++;
      prev = current;
      current = current.next;
    }
  }

  public void printList() {
    StringBuffer list = new StringBuffer();
    ListNode current = head;
    while (current != null) {
      list.append(current.val).append(", ");
      current = current.next;
    }
    System.out.println(list);

  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode foo = new ListNode(2);
    ListNode bar = new ListNode(3);
    TomsLinkedList tll = new TomsLinkedList(head);
    tll.append(foo);
    tll.append(bar);
    tll.insert(1, new ListNode(10));
    tll.remove(1);
    tll.printList();
  }

}
