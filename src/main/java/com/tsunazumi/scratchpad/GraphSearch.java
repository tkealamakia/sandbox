package com.tsunazumi.scratchpad;

import java.util.*;

public class GraphSearch {

  public static void main(String[] args) {
    Map<Integer, List<Integer>> graph = new HashMap<>();

    // Balanced
    graph.put(1, Arrays.asList(2, 3));  // Node 1 connected to 2 and 3
    graph.put(2, Arrays.asList(1, 4, 5));  // Node 2 connected to 1, 4, and 5
    graph.put(3, Arrays.asList(1, 6, 7));  // Node 3 connected to 1, 6, and 7
    graph.put(4, Arrays.asList(2));  // Node 4 connected to 2
    graph.put(5, Arrays.asList(2));  // Node 5 connected to 2
    graph.put(6, Arrays.asList(3));  // Node 6 connected to 3
    graph.put(7, Arrays.asList(3));  // Node 7 connected to 3

    List<Integer> result = bfs(graph, 6);
    for (int i : result) {
      System.out.println(i);
    }
  }

  public static List<Integer> dfs(Map<Integer, List<Integer>> graph, int start) {
    return null;
  }

  private static void dfsHelper(Map<Integer, List<Integer>> graph, int node, List<Integer> visited, Set<Integer> seen) {
  }

  public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int start) {
    return null;
  }

}
