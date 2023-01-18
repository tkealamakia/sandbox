package com.tsunazumi.dsa.crackingCodingInterview;

import com.tsunazumi.dsa.structures.Graph2;
import com.tsunazumi.dsa.structures.Project;

import java.util.ArrayList;

public class Cc47 {

  public static void main (String[] args) {
    String [] projects = { "a", "b", "c", "d", "e", "f" };
    String [] one = { "a", "d" };
    String [] two = { "f", "b" };
    String [] three = { "b", "d" };
    String [] four = { "f", "a" };
    String [] five = { "d", "c" };
    String [][] dependencies = { one, two, three, four, five };

    Project[] buildOrder = new Cc47().findBuildOrder(projects, dependencies);
    System.out.println(buildOrder);

  }

  /* Find a correct build order. */
  Project[] findBuildOrder(String[] projects, String[][] dependencies) {
    Graph2 graph = buildGraph(projects, dependencies);
    return orderProjects(graph.getNodes());
  }

  /* Build the graph, adding the edge (a, b) if b is dependent on a.  Assumes a pair
   * is listed in "build order". The pair (a, b) in dependencies indicates that b
   * depends on a and a must be built before b.
   */
  public static Graph2 buildGraph(String[] projects, String[][] dependencies) {
    Graph2 graph = new Graph2();
    for (String project : projects) {
      graph.getOrCreateNode(project);
    }

    for (String[] dependency : dependencies) {
      String first = dependency[0];
      String second = dependency[1];
      graph.addEdge(first, second);
    }

    return graph;
  }

  /* Return a list of the projects a correct build order. */
  Project[] orderProjects(ArrayList<Project> projects) {
    Project[] order = new Project[projects.size()];

    /* Add "roots" to the build order first. */
    int endOfList = addNonDependent(order, projects, 0);

    int toBeProcessed = 0;
    while (toBeProcessed < order.length) {
      Project current = order[toBeProcessed];

      /* We have a circular dependency since there are no remaining projects with
       * zero dependencies.
       */
      if (current == null) {
        return null;
      }

      /* Remove myself as a dependency. */
      ArrayList<Project> children = current.getChildren();
      for (Project child: children) {
        child.decrementDependencies();
      }

      /* Add children that have no one depending on them. */
      endOfList = addNonDependent(order, children, endOfList);
      toBeProcessed++;
    }
    return order;
  }

  int addNonDependent(Project[] order, ArrayList<Project> projects, int offset) {
    for (Project project : projects) {
      if (project.getNumberDependencies() == 0) {
        order[offset] = project;
        offset++;
      }
    }
    return offset;
  }
}
