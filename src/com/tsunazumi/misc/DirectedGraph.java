package com.tsunazumi.misc;

import com.tsunazumi.algorithms.structures.GraphNode;

import java.util.*;

public class DirectedGraph {
  public static void main (String args[]) {
    GraphNode node = new GraphNode(1);
    GraphNode node2 = new GraphNode(2);
    GraphNode node3 = new GraphNode(3);
    GraphNode node4 = new GraphNode(4);
    GraphNode node5 = new GraphNode(5);
    node.addAdjacent(node2);
    node2.addAdjacent(node3);
    node2.addAdjacent(node5);
    node3.addAdjacent(node4);
    node4.addAdjacent(node2);

    Collection <GraphNode> col2 =  getReachable(node2);
    System.out.println(col2);

  }

  public static Collection<GraphNode> getReachable(GraphNode start) {
    Collection<GraphNode> col = new TreeSet<>();
    addToCol(col, start);

    return col;
  }

  public static void addToCol(Collection<GraphNode> nodesFinal, GraphNode node) {
    if (nodesFinal.add(node)) {
      for (GraphNode adj : node.getAdjacent()) {
        addToCol(nodesFinal, adj);
      }
    }
  }

}