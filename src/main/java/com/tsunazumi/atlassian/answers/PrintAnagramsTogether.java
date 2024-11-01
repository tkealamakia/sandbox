package com.tsunazumi.atlassian.answers;

import java.util.*;

public class PrintAnagramsTogether {
  public static void main(String[] args) {
    String[] strings = {"cat", "dog", "tac", "god", "act"};
    String[] result = process(strings);
    Arrays.stream(result).forEach(System.out::println);
  }

  public static String[] process(String[] strings) {
    Map<String, List<String>> map = new HashMap<>();
    Outer:
    for (String s : strings) {
      for (String key : map.keySet()) {
        if (s.equals(key)) {
          continue;
        }
        if (isAnagram(s, key)) {
          map.get(key).add(s);
          continue Outer;
        }
      }
      map.put(s, new ArrayList<>());
    }
    List<String> resultList = new ArrayList<>();
    map.forEach((key, values) -> {
      resultList.add(key);
      resultList.addAll(values);
    });

    return resultList.toArray(new String[0]);
  }

  public static boolean isAnagram(String s1, String s2) {
    Set<Character> set = new HashSet<>();
    for (Character c : s1.toCharArray()) {
      set.add(c);
    }

    for (Character c : s2.toCharArray()) {
      set.remove(c);
    }

    return set.isEmpty();
  }
}
