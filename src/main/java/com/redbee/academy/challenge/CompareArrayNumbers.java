package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with the max of each index
   *
   * @param a - A List of Integers
   * @param b - Another List of Integers
   * @return The processed list
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    int max = Math.max(a.size(), b.size());
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < max; i++) {
      int numA = 0;
      int numB = 0;
      try {
        numA = a.get(i);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Array B is bigger.");
      }
      try {
        numB = b.get(i);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Array A is bigger.");
      }
      result.add(Math.max(numA, numB));
    }
    return result;
  }



}
