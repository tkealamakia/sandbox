package com.tsunazumi.algorithms.structures;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
  public enum State {COMPLETE, PARTIAL, BLANK};
  private State state = State.BLANK;
  private ArrayList<Project> children = new ArrayList<Project>();
  private HashMap<String, Project> map = new HashMap<String, Project>();
  private String name;
  private int dependencies = 0;

  public Project(String n) { name = n; }

  public void addNeighbor(Project node) {
    if (!map.containsKey(node.getName())) {
      children.add(node);
      map.put(node.getName(), node);
      node.incrementDependencies();
    }
  }

  public void incrementDependencies() { dependencies++; }
  public void decrementDependencies() { dependencies--; }

  public String getName() { return name; }
  public ArrayList<Project> getChildren() { return children; }
  public int getNumberDependencies() { return dependencies; }

  public State getState() { return state; }
  public void setState(State st) { state = st; }
}
