package com.tsunazumi.structures;

import java.util.ArrayList;
import java.util.List;

public class GraphNode implements Comparable<GraphNode> {

  int value;
  State state;
  List<GraphNode> adjacent = new ArrayList<>();

  public GraphNode(int value) {
    this.value = value;
    state = State.Unvisited;
  }

  public List<GraphNode> getAdjacent() {
    return adjacent;
  }

  public void addAdjacent(GraphNode adjacent) {
    this.adjacent.add(adjacent);
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public String toString() {
    return String.valueOf(value);
  }

  @Override
  public int compareTo(GraphNode o) {
    if (this.value > o.value) return 1;
    if (this.value < o.value) return -1;
    return 0;
  }
}
