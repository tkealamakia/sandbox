package com.tsunazumi.dsa.crackingCodingInterview;

public class Cc24 {

  public static void main(String[] args) {
    Cc24 cc = new Cc24();
    LinkedListNode node10 = cc.new LinkedListNode();
    node10.data = 10;
    LinkedListNode node8 = cc.new LinkedListNode();
    node8.data = 8;
    LinkedListNode node5 = cc.new LinkedListNode();
    node5.data = 5;
    LinkedListNode node2 = cc.new LinkedListNode();
    node2.data = 2;
    LinkedListNode node1 = cc.new LinkedListNode();
    node1.data = 1;
    
    node10.next = node8;
    node8.next = node5;
    node5.next = node2;
    node2.next = node1;
    
    System.out.println(printIt(node10));
    LinkedListNode node = partition(node10, 5);
    System.out.println(printIt(node));
    
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
  
  public static LinkedListNode partition(LinkedListNode node, int x) {
    LinkedListNode head = node;
    LinkedListNode tail = node;
    
    while (node != null) {
      LinkedListNode next = node.next;
      if (node.data < x) {
        node.next = head;
        head = node;
      } else {
        tail.next = node;
        tail = node;
      }
      node = next;
    }
    tail.next = null;
    return head;
  }

  class LinkedListNode {
    int data; 
    LinkedListNode next;
    public String toString() {
      return String.valueOf(data);
    }
  }

}
