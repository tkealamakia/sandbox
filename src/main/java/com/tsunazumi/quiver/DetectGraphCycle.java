package com.tsunazumi.quiver;

import java.util.*;

public class DetectGraphCycle {

  public static void main(String[] args) {
    Map<Integer, List<Integer>> graph = new HashMap<>();

    // Balanced with a cycle
    graph.put(1, Arrays.asList(2, 3));  // Node 1 connected to 2 and 3
    graph.put(2, Arrays.asList(1, 4, 5));  // Node 2 connected to 1, 4, and 5
    graph.put(3, Arrays.asList(1, 6, 7));  // Node 3 connected to 1, 6, and 7
    graph.put(4, Arrays.asList(2));  // Node 4 connected to 2
    graph.put(5, Arrays.asList(2, 6));  // Node 5 connected to 2 and 6 (cycle)
    graph.put(6, Arrays.asList(3, 5));  // Node 6 connected to 3 and 5 (cycle)
    graph.put(7, Arrays.asList(3));  // Node 7 connected to 3

    boolean result = isCyclic(graph);
    System.out.println(result);
  }

  public static boolean isCyclic(Map<Integer, List<Integer>> graph) {
    Set<Integer> visited = new HashSet<>();

    // Check all nodes in case the graph is disconnected
    for (int node : graph.keySet()) {
      if (!visited.contains(node)) {
        if (isCyclicUtil(node, -1, visited, graph)) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean isCyclicUtil(int node, int parent, Set<Integer> visited, Map<Integer, List<Integer>> graph) {
    visited.add(node);
    for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
      if (!visited.contains(neighbor)) {
        if (isCyclicUtil(neighbor, node, visited, graph)) {
          return true;
        }
      } else if (neighbor != parent) {
        return true;
      }
    }
    return false;
  }
}

