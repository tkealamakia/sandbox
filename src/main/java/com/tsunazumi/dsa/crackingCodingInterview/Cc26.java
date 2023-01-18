package com.tsunazumi.dsa.crackingCodingInterview;

public class Cc26 {
  public static void main(String [] args) {
    Cc26 cc = new Cc26();
    LinkedListNode node10 = cc.new LinkedListNode();
    node10.data = 10;
    LinkedListNode node8 = cc.new LinkedListNode();
    node8.data = 8;
    LinkedListNode node5 = cc.new LinkedListNode();
    node5.data = 5;
    LinkedListNode node2 = cc.new LinkedListNode();
    node2.data = 8;
    LinkedListNode node1 = cc.new LinkedListNode();
    node1.data = 10;
    
    node10.next = node8;
    node8.next = node5;
    node5.next = node2;
    node2.next = node1;

    System.out.println(printIt(node10));
    Cc26 c = new Cc26();
    System.out.println(c.isPalindrome(node10));
    
    
  }
  
  class LinkedListNode {
    int data; 
    LinkedListNode next;
    public String toString() {
      return String.valueOf(data);
    }
  }
  
  class Result {
    
    public Result(LinkedListNode node, boolean result) {
      this.node = node;
      this.result = result;
    }
    public LinkedListNode node;
    public boolean result;
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
  boolean isPalindrome(LinkedListNode head) {
    int length = lengthOfList(head);
    Result p = isPalindromeRecurse(head, length);
    return p.result;
  }
  
  Result isPalindromeRecurse(LinkedListNode head, int length) {
    Cc26 c = new Cc26();
    if (head == null || length <= 0) { //Even number of nodes
      return c.new Result(head, true);
    } else if (length == 1) { // Odd number of nodes
      return c.new Result(head.next, true);
    }
    
    // Recuse on sublist
    Result res = isPalindromeRecurse(head.next, length - 2);
    
    // If child calls are not a palindrome, pass back up a failure.
    if (!res.result || res.node == null) {
      return res;
    }
    
    //Check if matches corresponding node or other side.
    res.result = (head.data == res.node.data);
    
    res.node = res.node.next;
    
    return res;
  }
  
  int lengthOfList(LinkedListNode n) {
    int size = 0;
    while (n != null) {
      size++;
      n = n.next;
    }
    return size;
  }

}
