package com.tsunazumi.algorithms.hackerrank.datastructures.archive;

public class InsertInLinkedList {

  static class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
      this.data = nodeData;
      this.next = null;
    }
  }

  static class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
      this.head = null;
      this.tail = null;
    }

    public void insertNode(int nodeData) {
      SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

      if (this.head == null) {
        this.head = node;
      } else {
        this.tail.next = node;
      }

      this.tail = node;
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList llist = new SinglyLinkedList();
    llist.insertNode(1);
    llist.insertNode(2);
    llist.insertNode(3);

    SinglyLinkedListNode result = insertNodeAtPosition(llist.head, 4, 2);
    do {
      System.out.println(result.data);
      result = result.next;
    } while (result != null);

  }

  public static SinglyLinkedListNode insertNodeAtPosition (
      SinglyLinkedListNode llist, int data, int position) {

    SinglyLinkedListNode head = llist;

    if (llist == null) {
      SinglyLinkedListNode node = new SinglyLinkedListNode(data);
      return node;
    }

    // traverse the linkedlist to the position
    int current = 0;

    SinglyLinkedListNode previous = null;
    SinglyLinkedListNode next = null;

    do  {

      // get the current node - 1 store that for later use
      if (current == position - 1) {
        previous = llist;
      }
      if (current == position) {
        System.out.println("found the position at " + current);
        // Create the new node
        SinglyLinkedListNode insertionNode = new SinglyLinkedListNode(data);
        // assign the current node as the next() in the insertionNode
        insertionNode.next = llist;
        // assign the pervious next to the new insertionNode
        previous.next = insertionNode;
      }
      llist = llist.next;
      current++;
    } while (llist != null);

    return head;
  }
}
