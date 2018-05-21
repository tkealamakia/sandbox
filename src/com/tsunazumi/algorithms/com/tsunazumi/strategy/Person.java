package com.tsunazumi.algorithms.com.tsunazumi.strategy;

public class Person {
  private String name;
  private int level;

  private Profession profession;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public Profession getProfession() {
    return profession;
  }

  public void setProfession(Profession profession) {
    this.profession = profession;
  }

  public void work() {
    if (profession == null) {
      System.out.println("unemployed");
    }
    else {
      profession.work();
    }
  }
}
