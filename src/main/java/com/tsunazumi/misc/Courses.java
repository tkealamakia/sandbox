package com.tsunazumi.misc;

import java.util.*;

public class Courses {
  Collection<Course> courses = new ArrayList<>();
  Map<String, Course> courseMap = courseMap();

  public Courses(Collection<Course> courses) {
    this.courses = courses;
    courseMap = courseMap();
  }

  public String getDependencies(String courseId, Set<String> result) {
    Course course = courseMap.get(courseId);
    Collection<String> pre = course.getDeps();
    if (pre.isEmpty()) {
      return "";
    }

    for (String s : course.getDeps()) {
      getDependencies(s, result);
      result.add(s);
    }

    return "";
  }

  public Map<String, Course> courseMap() {
    Map<String, Course> map = new HashMap<>();
    for (Course c: courses) {
      map.put(c.getCourseId(), c);
    }
    return map;
  }

  public static void main(String[] args) {
    Course english = new Course("english", Collections.EMPTY_LIST);
    Course history = new Course("history", Arrays.asList("english"));
    Course math = new Course("math", Arrays.asList("history"));
    Course science = new Course("science", Arrays.asList("history", "math"));

    List<Course> courseList = new ArrayList<>();
    courseList.add(english);
    courseList.add(history);
    courseList.add(math);
    courseList.add(science);

    Courses courses = new Courses(courseList);

    Set<String> result = new HashSet<>();
    String res = courses.getDependencies("science", result);
    System.out.println(result);



  }
}

