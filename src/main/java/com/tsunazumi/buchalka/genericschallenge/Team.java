package com.tsunazumi.buchalka.genericschallenge;

public class Team<T> {
  String name;
  public Team (String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }
}
