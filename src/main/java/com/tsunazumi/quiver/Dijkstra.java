package com.tsunazumi.quiver;

import com.tsunazumi.structures.DNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    // Set distance (default was max int)
    source.setDistance(0);
    // Create Set settled nodes
    Set<DNode> settledNodes = new HashSet<>();
    // Create a queue for unsettled nodes and initialize it with the first one
    Queue<DNode> unsettledNodes = new PriorityQueue<>(Collections.singleton(source));
    // Loop through the queue (like breadth first search)
    while (!unsettledNodes.isEmpty()) {
      DNode sourceNode = unsettledNodes.poll();
      // Loop through adjacent nodes
      sourceNode.getAdjacentNodes()
          .entrySet().stream()
          .filter(entry -> !settledNodes.contains(entry.getKey()))
          .forEach(entry -> {
            evaluateDistanceAndPath(entry.getKey(), entry.getValue(), sourceNode);
            // We haven't seen this node before so add it so we can explore it
            unsettledNodes.add(entry.getKey());
          });
      settledNodes.add(sourceNode);
    }
  }

  private static void evaluateDistanceAndPath(DNode adjacentNode, Integer edgeWeight, DNode sourceNode) {
    // sourceNode really only the last connected node, not the origin node
    // sourceNode.getDistance() is the current known shortest distance
    // Add sourceNode.getDistance() to the adjacent node weight
    Integer newDistance = sourceNode.getDistance() + edgeWeight;
    // If adjacentNode's distance has not been set this is infinity
    // otherwise we've visited this node before and have a non-infinite distance
    if (newDistance < adjacentNode.getDistance()) {
      // need to register the new distance if it's less
      adjacentNode.setDistance(newDistance);
      // getShortestPath for B might look like this [A]
      // So setting the shortest path from B(sourceNode) for C (adjacentNode)
      // would result in [A,B]
      // Essentially we are taking the sourceNode's shortest path, and then appending itself to it
      adjacentNode.setShortestPath(
          Stream.concat(sourceNode.getShortestPath().stream(), Stream.of(sourceNode)).toList()
      );
    }
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


