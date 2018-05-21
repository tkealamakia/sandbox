package com.tsunazumi.misc;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

  public static void main(String[] args) {
    //new StringPermutation().permutation("Tom");
    Map<String, String> map = new HashMap<>();
    map.put("1", "value");
    map.put("1", "value2");
    
  }
  
  void permutation(String str) {
    permutation(str, "");
  }
  
  void permutation(String str, String prefix) {
    if (str.length() == 0) {
      System.out.println(prefix);
    }
    else {
      for (int i=0; i < str.length(); i++) {
        String rem = str.substring(0, i) + str.substring(i+1);
        permutation(rem, prefix + str.charAt(i));
      }
    }
  }

}
