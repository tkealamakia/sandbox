package com.tsunazumi.buchalka.genericschallenge;

import com.tsunazumi.misc.Foo;

public class Main {
  public static void main(String[] args) {
    Team<FootballTeam> dolphins = new Team("Dolphins");
    Team<FootballTeam> eagles = new Team("Eagles");
    Team<BasketballTeam> jazz = new Team("Jazz");
    Team<BasketballTeam> lakers = new Team("Lakers");

    League<Team<FootballTeam>> nfl = new League<>("NFL");
    nfl.addTeam(dolphins);
    nfl.addTeam(eagles);

    League<Team<BasketballTeam>> nba = new League<>("NBA");
    nba.addTeam(jazz);
    nba.addTeam(lakers);

    nfl.print();
    System.out.println();
    nba.print();
  }
}
