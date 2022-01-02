package com.tsunazumi.algorithms.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArrayManipulation {
//  public static void main(String[] args) {
//    int n = 4000;
////    List<Integer> one = Arrays.asList(1, 5, 3);
////    List<Integer> two = Arrays.asList(4, 8, 7);
////    List<Integer> three = Arrays.asList(6, 9, 1);
//    List<Integer> one = Arrays.asList(2250, 2540, 180674);
//    List<Integer> two = Arrays.asList(2459, 3892, 434122);
//    List<Integer> three = Arrays.asList(2559, 3893, 534122);
//    List<List<Integer>> lists = Arrays.asList(one, two, three);
//
//    long result = arrayManipulation(n, lists);
//    System.out.println(result);
//  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);

    int m = Integer.parseInt(firstMultipleInput[1]);

    List<List<Integer>> queries = new ArrayList<>();

    IntStream.range(0, m).forEach(i -> {
      try {
        queries.add(
            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    long result = arrayManipulation(n, queries);
    System.out.println(result);

    //bufferedWriter.write(String.valueOf(result));
    //bufferedWriter.newLine();

    bufferedReader.close();
    //bufferedWriter.close();
  }

  public static long arrayManipulation(int n, List<List<Integer>> queries) {

    Integer[][] integerArray = queries.stream().map(u -> u.toArray(new Integer[0])).toArray(Integer[][]::new);

    long outputArray[] = new long[n + 2];
    for (int i = 0; i < integerArray.length; i++) {
      int a = integerArray[i][0];
      int b = integerArray[i][1];
      int k = integerArray[i][2];
      outputArray[a] += k;
      outputArray[b+1] -= k;
    }
    long max = getMax(outputArray);
    return max;
  }

  /**
   * @param inputArray
   * @return
   */
  private static long getMax(long[] inputArray) {
    long max = Long.MIN_VALUE;
    long sum = 0;
    for (int i = 0; i < inputArray.length; i++) {
      sum += inputArray[i];
      max = Math.max(max, sum);
    }
    return max;
  }

//  public static long arrayManipulation(int n, List<List<Integer>> queries) {
//
//    System.out.println("check1");
//    Integer[][] integerArray = queries.stream().map(u -> u.toArray(new Integer[0])).toArray(Integer[][]::new);
//
//    // Build the result array
//    long[] result = new long[n];
//    for (int i=0; i < n; i++) {
//      result[i] = 0;
//    }
//
//    for (int i=0; i<integerArray.length; i++ ) {
//      int index = integerArray[i][0]-1;
//      int endIndex = integerArray[i][1]-1;
//      // Loop through the range that was given
//      while (index <= endIndex) {
//        // Calculate the new value
//        long value = integerArray[i][2] + result[(int)index];
//        // Set the new value into the array
//        result[(int)index] = value;
//        index++;
//      }
//
//    }
//
//    OptionalLong max = Arrays.stream(result).max();
//    return max.getAsLong();
//  }
}
