package com.tsunazumi.misc;

import java.util.ArrayList;
import java.util.List;

public class CodeBuilder {

  private String className;
  private List<String> fields = new ArrayList<>();

  public CodeBuilder(String className) {
    this.className = className;
  }

  public CodeBuilder addField(String name, String type) {
    fields.add("public " + type + " " + name);
    return this;
  }

  @Override
  public String toString() {
    String classString = "public class " + className + " { \n";
    for (String field : fields) {
      classString += "  ";
      classString += field;
      classString += ";\n";
    }
    classString += "}";
    return classString;
  }

  public static void main(String[] args) {
    CodeBuilder cb = new CodeBuilder("Person")
        .addField("name", "String")
        .addField("age", "int");
    System.out.println(cb);

  }




}

