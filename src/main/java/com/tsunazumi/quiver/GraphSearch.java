package com.tsunazumi.quiver;

import java.util.*;

public class GraphSearch {

  public static void main(String[] args) {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    graph.put(1, Arrays.asList(2,3));
    graph.put(2, Arrays.asList(1,4,5));
    graph.put(3, Arrays.asList(1,6));
    graph.put(4, Arrays.asList(2));
    graph.put(5, Arrays.asList(2));
    graph.put(6, Arrays.asList(3));
    List<Integer> result = dfs(graph, 6);
    for (int i : result) {
      System.out.println(i);
    }
  }

  public static List<Integer> dfs(Map<Integer, List<Integer>> graph, int start) {
    List<Integer> visited = new ArrayList<>();
    Set<Integer> seen = new HashSet<>();
    dfsHelper(graph, start, visited, seen);
    return visited;
  }

  private static void dfsHelper(Map<Integer, List<Integer>> graph, int node, List<Integer> visited, Set<Integer> seen) {
    if (seen.contains(node)) return;
    seen.add(node);
    visited.add(node);
    for (int neighbor: graph.getOrDefault(node, Collections.emptyList())) {
      dfsHelper(graph, neighbor, visited, seen);
    }
  }

  public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int start) {
    Set<Integer> seen = new HashSet<>();
    List<Integer> visited = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);

    while (!queue.isEmpty()) {
      int node = queue.poll();
      if (!seen.contains(node)) {
        seen.add(node);
        visited.add(node);
        queue.addAll(graph.getOrDefault(node, Collections.emptyList()));
      }
    }
    return visited;
  }

}
