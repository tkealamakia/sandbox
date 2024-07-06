package com.tsunazumi.dsa.structures;

public class ListNode {
  public int val;
  public ListNode next;
  public ListNode prev;

  public ListNode(int nodeData) {
    this.val = nodeData;
    this.next = null;
    this.prev = null;
  }
}
