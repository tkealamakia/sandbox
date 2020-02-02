package com.tsunazumi.misc.buchalka;

public abstract class Team implements Comparable<Team> {
  private String name;
  private int rank;

  public Team(String name, int rank) {
    this.name = name;
    this.rank = rank;
  }

  public String getName() {
    return name;
  }

  public int getRank() {
    return rank;
  }

  public int compareTo(Team team) {
    if (team.getRank() < this.getRank()) {
      return -1;
    } else if (team.getRank() < this.getRank()) {
      return 1;
    } else {
      return 0;
    }
  }

  public String toString() {
    return name + " " + rank;
  }


  public abstract void play();
}
