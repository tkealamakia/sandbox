package com.tsunazumi.dsa.theprimagen;


import com.tsunazumi.dsa.structures.Node;

public class Queue {
  private int count = 0;
  private Node head = null;
  private Node tail = null;

  public static void main(String[] args) {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Queue queue = new Queue();
    queue.enqueue(node1);
    queue.enqueue(node2);
    queue.enqueue(node3);
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.peek());
  }

  public void enqueue(Node node) {
    count++;
    if (head == null && tail == null) {
      head = node;
      tail = node;
    }
    else {
      tail.setNext(node);
      tail = node;
    }
  }

  public int dequeue() {
    count--;
    if (head != null) {
      int headValue = head.getValue();
      head = head.getNext();
      return headValue;
    }
    return 0;
  }

  public int peek() {
    if (head != null) {
      return head.getValue();
    }
    return 0;
  }


}
