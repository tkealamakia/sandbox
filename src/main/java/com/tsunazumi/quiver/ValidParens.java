package com.tsunazumi.quiver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ValidParens {
  public static void main(String[] args) {
    String input = ")(){}";
//    String input = "{(){}}";
    // {({   )}}
    System.out.println(isValid(input));
  }

  static boolean isValid(String input) {
    Set<Character> left = Set.of('(', '{', '[');
    Map <Character, Character> matches = Map.of(
        '(', ')',
        '[', ']',
        '{', '}'
    );
    // Create a stack of left side
    Stack<Character> stackLeft = new Stack<>();
    char[] chars = input.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (left.contains(chars[i])) {
        stackLeft.push(chars[i]);
      } else if (!stackLeft.isEmpty()) {
        char current = stackLeft.pop();
        if (matches.get(current) != chars[i]) {
          return false;
        }
      } else {
        return false;
      }
    }
    if (stackLeft.empty()) {
      return true;
    }
    return false;
  }
}
