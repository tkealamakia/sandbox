package com.tsunazumi.algorithms.strategy;

public class Main {

  public static void main(String [] args) {
    Person tom = new Person();
    tom.setProfession(new Engineer());
    tom.work();
  }
}
