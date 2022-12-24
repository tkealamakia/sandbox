package com.tsunazumi.buchalka.genericschallenge;

import java.util.ArrayList;
import java.util.List;

public class League<T extends Team> {
  String name;
  List<T> teams = new ArrayList<>();

  public League(String name) {
    this.name = name;
  }

  public void addTeam(T team) {
    teams.add(team);
  }

  public void print() {
    System.out.println(name);
    System.out.println("----------------");
    teams.forEach( System.out::println);
  }
}
