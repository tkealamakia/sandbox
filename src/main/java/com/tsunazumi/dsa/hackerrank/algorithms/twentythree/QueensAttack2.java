package com.tsunazumi.dsa.hackerrank.algorithms.twentythree;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class QueensAttack2 {

  public static void main(String[] args) throws IOException {
//    List<List<Integer>> obstacles = new ArrayList<>();
//    obstacles.add(Arrays.asList(0));
//    obstacles.add(Arrays.asList(3));
//    obstacles.add(Arrays.asList(0));
//    obstacles.add(Arrays.asList(2));
//    obstacles.add(Arrays.asList(5));
//
//
//    int result = queensAttack(5, 3, 4, 3, obstacles);
////    int result = queensAttack(4, 0, 4, 4, null);
//    System.out.println(result);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);

    int k = Integer.parseInt(firstMultipleInput[1]);

    String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int r_q = Integer.parseInt(secondMultipleInput[0]);

    int c_q = Integer.parseInt(secondMultipleInput[1]);

    List<List<Integer>> obstacles = new ArrayList<>();

    IntStream.range(0, k).forEach(i -> {
      try {
        obstacles.add(
            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    int result = queensAttack(n, k, r_q, c_q, obstacles);

    System.out.println((String.valueOf(result)));
    System.out.println();

    bufferedReader.close();
  }

  // n = rows & columns, k = #obstacles
  public static int queensAttack(int n, int k, int r_q, int c_q,
                                 List<List<Integer>> obstacles) {

    Set<String> blockers = new HashSet<>();
    if (obstacles != null && obstacles.size() > 0) {
      for (List<Integer> list : obstacles) {
        String res = list.get(0) + " " + list.get(1);
        blockers.add(res);
      }
    }

    // ******************** Horizontal ***********************
    // loop from 4,3 to 4,1 (decrement to left horizontal)
    int horizontalCount = 0;
    int leftHor = c_q - 1;
    while (leftHor > 0) {
      if (blockers.contains(r_q + " " + leftHor)) {
        break;
      }
      horizontalCount++;
      leftHor--;
    }
    // loop from 4,3 to 4,5 (increment to right horizontal)
    int rightHor = c_q;
    while (rightHor < n) {
      if (blockers.contains(r_q + " " + rightHor)) {
        break;
      }
      horizontalCount++;
      rightHor++;
    }

    // ******************** Vertical ***********************
    // loop from 4,3 to 5,3 (increment to top vertical)
    int verticalCount = 0;
    int topHor = r_q;
    while (topHor < n) {
      if (blockers.contains(topHor + " " + c_q)) {
        break;
      }
      verticalCount++;
      topHor++;
    }
    // loop from 4,3 to 1,3 (decrement to bot vertical)
    int botHor = r_q - 1;
    while (botHor > 0) {
      if (blockers.contains(botHor + " " + c_q)) {
        break;
      }
      verticalCount++;
      botHor--;
    }
    // ******************** Diagonal ***********************
    int diagonalCount = 0;
    // diagonal down
    //  (5, 2)  :(4,3):  (3, 4) (2, 5)
    // loop from 4,3 to 5,2 (decrement to down diagonal)
    int r = r_q;
    int c = c_q;
    while (r < n && c > 0) {
      if (blockers.contains((r+1) + " " + (c-1))) {
        break;
      }
      diagonalCount++;
      r++;
      c--;
    }

    //  (5, 2)  :(4,3):  (3, 4) (2, 5)
    // loop from 4,3 to 2,5 (increment to down diagonal)
    r = r_q;
    c = c_q;
    while (c < n && r > 0) {
      if (blockers.contains((r-1) + " " + (c+1))) {
        break;
      }
      diagonalCount++;
      r--;
      c++;
    }


    //  (2, 1)  (3,2):  :(4, 3):   (5, 4) (increment to up diagonal)
    r = r_q;
    c = c_q;
    while (r < n && c < n) {
      if (blockers.contains((r+1) + " " + (c+1))) {
        break;
      }
      diagonalCount++;
      r++;
      c++;
    }

    //  (2, 1)  (3,2):  :(4, 3):   (5, 4) (decrement to up diagonal)
    r = r_q - 1;
    c = c_q - 1;
    while (r > 0 && c > 0) {
      if (blockers.contains((r) + " " + (c))) {
        break;
      }
      diagonalCount++;
      r--;
      c--;
    }


    return horizontalCount + verticalCount + diagonalCount;

  }
}
