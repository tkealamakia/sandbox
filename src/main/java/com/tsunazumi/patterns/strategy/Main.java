package com.tsunazumi.patterns.strategy;

public class Main {

  public static void main(String [] args) {
    Person tom = new Person();
    tom.setProfession(new Engineer());
    tom.work();
		System.out.println("hello Macbook Air M1");
  }
}
