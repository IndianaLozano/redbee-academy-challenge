package com.redbee.academy.challenge;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    List<Integer> list = Stream.of(a, b, c)
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    return Collections.max(list);
  }
}
