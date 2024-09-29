package com.tsunazumi.scratch;

import com.tsunazumi.dsa.structures.DNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Dijkstra {
  public static void main(String[] args) {
    DNode nodeA = new DNode("A");
    DNode nodeB = new DNode("B");
    DNode nodeC = new DNode("C");
    DNode nodeD = new DNode("D");
    DNode nodeE = new DNode("E");
    DNode nodeF = new DNode("F");

    nodeA.addAdjacentNode(nodeB, 2);
    nodeA.addAdjacentNode(nodeC, 4);

    nodeB.addAdjacentNode(nodeC, 3);
    nodeB.addAdjacentNode(nodeD, 1);
    nodeB.addAdjacentNode(nodeE, 5);

    nodeC.addAdjacentNode(nodeD, 2);

    nodeD.addAdjacentNode(nodeE, 1);
    nodeD.addAdjacentNode(nodeF, 4);

    nodeE.addAdjacentNode(nodeF, 2);
    calculateShortestPath(nodeA);
    printPaths(Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));
  }

  public static void calculateShortestPath(DNode source) {
  }

  private static void evaluateDistanceAndPath(DNode adjacentNode, Integer edgeWeight, DNode sourceNode) {
  }

  private static void printPaths(List<DNode> nodes) {
    nodes.forEach(node -> {
      String path = node.getShortestPath().stream()
          .map(DNode::getName)
          .collect(Collectors.joining(" -> "));
      System.out.println((path.isBlank()
        ? "%s : %s".formatted(node.getName(), node.getDistance())
        : "%s -> %s : %s".formatted(path, node.getName(), node.getDistance()))
      );
    });
  }
}


