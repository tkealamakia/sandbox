package com.tsunazumi.misc;

import java.util.Collection;

public class Course {
  private String courseId;
  private Collection<String> deps;

  public Course(String courseId, Collection<String> deps) {
    this.courseId = courseId;
    this.deps = deps;
  }

  public String getCourseId() {
    return courseId;
  }

  public Collection<String> getDeps() {
    return deps;
  }
}
