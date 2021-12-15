package com.tsunazumi.buchalka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

  private List<T> teams = new ArrayList<>();

  public void addTeam(T team) {
    teams.add(team);
  }

  public void printTeams() {
    teams.forEach(System.out::println);
  }

  public void sortByRank() {
    Collections.sort(teams);
  }

  public static void main(String[] args) {
    FootballTeam dolphins = new FootballTeam("Dolphins", 0);
    FootballTeam cowboys = new FootballTeam("Cowboys", 1);
    FootballTeam chiefs = new FootballTeam("Chiefs", 2);
    League<FootballTeam> nfl = new League<>();
    nfl.addTeam(dolphins);
    nfl.addTeam(cowboys);
    nfl.addTeam(chiefs);
    nfl.printTeams();
    nfl.sortByRank();
    nfl.printTeams();
  }
}
