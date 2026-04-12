package com.tsunazumi.quiver;

import java.util.HashMap;

class LRUCache {

  // doubly linked list node
  class Node {
    int key, value;
    Node prev, next;
    Node(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  private int capacity;
  private HashMap<Integer, Node> map;
  private Node head, tail; // dummy head and tail

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.map = new HashMap<>();

    // dummy nodes so we never have to deal with null checks
    head = new Node(0, 0);
    tail = new Node(0, 0);
    head.next = tail;
    tail.prev = head;
  }

  public int get(int key) {
    if (!map.containsKey(key)) return -1;
    Node node = map.get(key);
    // move to front since it was just accessed
    moveToFront(node);
    return node.value;
  }

  public void put(int key, int value) {
    if (map.containsKey(key)) {
      // update existing node and move to front
      Node node = map.get(key);
      node.value = value;
      moveToFront(node);
    } else {
      Node node = new Node(key, value);
      map.put(key, node);
      addToFront(node);

      if (map.size() > capacity) {
        // evict the least recently used (node before tail)
        Node lru = tail.prev;
        remove(lru);
        map.remove(lru.key);
      }
    }
  }

  // remove a node from its current position in the list
  private void remove(Node node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }

  // insert a node right after the dummy head (most recent position)
  private void addToFront(Node node) {
    node.next = head.next;
    node.prev = head;
    head.next.prev = node;
    head.next = node;
  }

  private void moveToFront(Node node) {
    remove(node);
    addToFront(node);
  }
}