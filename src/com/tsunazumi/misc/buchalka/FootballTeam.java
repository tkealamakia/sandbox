package com.tsunazumi.misc.buchalka;

public class FootballTeam extends Team {

  public FootballTeam(String name, int rank) {
    super(name, rank);
  }

  @Override
  public void play() {
    System.out.println("playing football");
  }
}
