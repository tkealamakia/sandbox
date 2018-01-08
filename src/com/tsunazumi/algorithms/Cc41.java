package com.tsunazumi.algorithms;

import com.tsunazumi.algorithms.structures.Graph;
import com.tsunazumi.algorithms.structures.GraphNode;
import com.tsunazumi.algorithms.structures.State;

import java.util.LinkedList;
import java.util.List;

public class Cc41 {
  public static void main (String[] args) {
    GraphNode n1 = new GraphNode(1);
    GraphNode n2 = new GraphNode(2);
    GraphNode n3 = new GraphNode(3);
    GraphNode n4 = new GraphNode(4);
    GraphNode n5 = new GraphNode(5);
    GraphNode n6 = new GraphNode(6);

    n1.addAdjacent(n2);
    n1.addAdjacent(n6);

    n2.addAdjacent(n4);
    n2.addAdjacent(n6);

    n4.addAdjacent(n5);

    n5.addAdjacent(n3);

    n6.addAdjacent(n5);
    n6.addAdjacent(n3);
    GraphNode[] array = { n1, n2, n3, n4, n5, n6 };

    Graph graph = new Graph(array);
    //System.out.println(search(graph, n1, n5));
    System.out.println(searchDepth(n1, n5));


  }

  static boolean searchDepth (GraphNode start, GraphNode end) {
    if (start == end) return true;

    for (GraphNode node : start.getAdjacent()) {
      if (node.getState() == State.Visited) {
        continue;
      }
      node.setState(State.Visited);
      // We found it now what?
      if (node == end) {
        return true;
      }
      return searchDepth(node, end);
    }

    return false;
  }

  static boolean search (Graph g, GraphNode start, GraphNode end) {
    if (start == end) return true;

    LinkedList<GraphNode> q = new LinkedList<>();

    start.setState(State.Visting);
    q.add(start);
    GraphNode u;
    while (!q.isEmpty()) {
      u = q.removeFirst();
      if (u != null) {
        for (GraphNode v : u.getAdjacent()) {
          if (v.getState() == State.Unvisited) {
            if (v == end) {
              return true;
            }
            else {
              v.setState(State.Visting);
              q.add(v);
            }
          }
        }
        u.setState(State.Visited);
      }
    }
    return false;
  }

}
