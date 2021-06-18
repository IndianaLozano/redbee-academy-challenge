package com.redbee.academy.challenge;

import java.util.List;
import java.util.stream.IntStream;

public class SumArrayNumbers {

  /**
   * Method that receives an array of numbers and
   * returns the sum of each number
   *
   * @param array - Some integer list. ([1,2,3])
   * @return The result of 1 + 2 + 3
   */
  public static Integer sum(List<Integer> array) {
    return array.stream().reduce(0, Integer::sum);
  }
}
