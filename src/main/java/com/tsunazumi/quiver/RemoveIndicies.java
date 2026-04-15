package com.tsunazumi.quiver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveIndicies {
  public static void main(String[] args) {
    String str1 = "abdgggda";
    String str2 = "abdggda";
    List<Integer> result = getRemovableIndices(str1, str2);
    for (int i : result) {
      System.out.println(i);
    }


  }
  public static List<Integer> getRemovableIndices(String str1, String str2) {
    List<Integer> result = new ArrayList<>();

    for (int i=0; i < str1.length(); i++) {
      // remove a character at a time
      String shortened = str1.substring(0, i) + str1.substring(i+1);
      if (shortened.equals(str2)) {
        result.add(i);
      }
    }

    if (result.isEmpty()) {
      result.add(-1);
    }

    return result;

  }


}
