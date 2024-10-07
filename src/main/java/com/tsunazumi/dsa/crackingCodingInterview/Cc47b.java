package com.tsunazumi.dsa.crackingCodingInterview;

import com.tsunazumi.structures.Graph2;
import com.tsunazumi.structures.Project;

import java.util.ArrayList;
import java.util.Stack;

public class Cc47b {

  public static void main (String[] args) {
    String [] projects = { "a", "b", "c", "d", "e", "f" };
    String [] one = { "a", "d" };
    String [] two = { "f", "b" };
    String [] three = { "b", "d" };
    String [] four = { "f", "a" };
    String [] five = { "d", "c" };
    String [][] dependencies = { one, two, three, four, five };

    Stack<Project> buildOrder = new Cc47b().findBuildOrder(projects, dependencies);
    while (!buildOrder.empty()) {
      System.out.println(buildOrder.pop().getName());
    }

  }
  public static Stack<Project> findBuildOrder(String[] projects, String[][] dependencies) {
    Graph2 graph = Cc47.buildGraph(projects, dependencies);
    return orderProjects(graph.getNodes());
  }

  public static Stack<Project> orderProjects(ArrayList<Project> projects) {
    Stack<Project> stack = new Stack<Project>();
    for (Project project : projects) {
      if (project.getState() == Project.State.BLANK) {
        if (!doDFS(project, stack)) {
          return null;
        }
      }
    }
    return stack;
  }

  public static boolean doDFS(Project project, Stack<Project> stack) {
    if (project.getState() == Project.State.PARTIAL) {
      return false;
    }

    if (project.getState() == Project.State.BLANK) {
      project.setState(Project.State.PARTIAL);
      ArrayList<Project> children = project.getChildren();
      for (Project child : children) {
        if (!doDFS(child, stack)) {
          return false;
        }
      }
      project.setState(Project.State.COMPLETE);
      stack.push(project);
    }
    return true;
  }

}
