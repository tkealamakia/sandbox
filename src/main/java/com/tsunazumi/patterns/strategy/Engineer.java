package com.tsunazumi.patterns.strategy;

public class Engineer implements Profession {
  @Override
  public void work() {
    System.out.println("type code");
  }
}