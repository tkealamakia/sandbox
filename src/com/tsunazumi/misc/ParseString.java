package com.tsunazumi.algorithms;

import java.util.Iterator;

public class ParseString {

  public static void main (String[] args) {
    String str = "how now (brown) cow";
    CharIterator iter = new CharIterator(str);
    System.out.println(iter.next());
    System.out.println(iter.next());
    System.out.println(iter.next());
    System.out.println(iter.next());

  }
}

class CharIterator implements Iterator<String> {

  char[] ca = null;
  int index = 0;

  public CharIterator(String str) {
    ca = str.toCharArray();
  }


  @Override
  public String next() {
    StringBuilder token = new StringBuilder();
    for (int i = index; i < ca.length; i++) {
      if (ca[i] == ' ') {
        index++;
        return token.toString();
      }
      token.append(ca[i]);
      index++;
    }
    return token.toString();
  }

  @Override
  public boolean hasNext() {
    return true;
  }

}
