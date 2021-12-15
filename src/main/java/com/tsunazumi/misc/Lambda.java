package com.tsunazumi.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {
  public static void main(String[] args) {
    Personx tom = new Personx("Tom");
    Personx heather = new Personx("Heather");
    Personx seth = new Personx("Seth");

    List<Personx> persons = new ArrayList<>();
    persons.add(tom);
    persons.add(heather);
    persons.add(seth);

    Collections.sort(persons, Comparator.comparing(Personx::getName));

    for (Personx p : persons) {
      System.out.println(p.getName());
    }
  }

}

class Personx {
  String name;

  public Personx(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
