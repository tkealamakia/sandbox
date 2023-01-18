package com.tsunazumi.dsa.crackingCodingInterview;

public class Cc21 {

  public static void main(String[] args) {
    Cc21 cc21 = new Cc21();
    LinkedListNode linkedListNode = cc21.new LinkedListNode();
    LinkedListNode current = linkedListNode;
    for (int i = 0; i < 5; i++) {
      current.data = i;
      current.next = cc21.new LinkedListNode();
      current = current.next;
    }
    System.out.println(printIt(linkedListNode));
    Cc21 obj = new Cc21();
    obj.deleteDups(linkedListNode);
    System.out.println(printIt(linkedListNode));
    obj.printKthToLast(linkedListNode, 3);


  }
  
  public static String printIt(LinkedListNode node) {
    StringBuffer sb = new StringBuffer();
    sb.append(node.data);
    LinkedListNode current = node;
    while (current.next != null) {
      sb.append(":");
      sb.append(current.next.data);
      current = current.next;
    }
    return sb.toString();
  }

  class LinkedListNode {
    int data; 
    LinkedListNode next;
    public String toString() {
      return String.valueOf(data);
    }
  }
  
  int printKthToLast(LinkedListNode head, int k) {
    if (head == null) {
      return 0;
    }
    int index = printKthToLast(head.next, k) + 1;
    if (index == k) {
      System.out.println(k + "th to last node is " + head.data);
    }
    return index;
  }
  
  void deleteDups(LinkedListNode head) {
    LinkedListNode current = head;
    while (current != null) {
      LinkedListNode runner = current;
      while (runner.next != null) {
        if (runner.next.data == current.data) {
          runner.next = runner.next.next;
        } else {
          runner = runner.next;
        }
      }
      current = current.next;
    }
  }

}
