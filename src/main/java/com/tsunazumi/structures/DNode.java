package com.tsunazumi.structures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DNode implements Comparable<DNode> {
  private final String name;
  private Integer distance = Integer.MAX_VALUE;
  private List<DNode> shortestPath = new LinkedList<>();
  private Map<DNode, Integer> adjacentNodes = new HashMap<>();

  public DNode(String name) {
    this.name = name;
  }

  public void addAdjacentNode(DNode node, int weight) {
    adjacentNodes.put(node, weight);
  }

  @Override
  public int compareTo(DNode node) {
    return Integer.compare(this.distance, node.getDistance());
  }

  public String getName() {
    return name;
  }

  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public List<DNode> getShortestPath() {
    return shortestPath;
  }

  public void setShortestPath(List<DNode> shortestPath) {
    this.shortestPath = shortestPath;
  }

  public Map<DNode, Integer> getAdjacentNodes() {
    return adjacentNodes;
  }

  public void setAdjacentNodes(Map<DNode, Integer> adjacentNodes) {
    this.adjacentNodes = adjacentNodes;
  }
}
