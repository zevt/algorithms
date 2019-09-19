package com.zeroexception.courses.fundamentalalgorithms.datastructure;

import static com.zeroexception.courses.fundamentalalgorithms.datastructure.BasicStructure01.findPeaks;
import static com.zeroexception.courses.fundamentalalgorithms.datastructure.BasicStructure01.findValleys;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** @author Viet Quoc Tran vt on 2019-09-19. www.zeroexception.com */
class BasicStructure01Test {

  @Test
  void test_findPeaks() {
    int[] input = new int[] {2, 3, 5, 1, 4, 3, 6, 7, 9, 8};
    int[] peak = findPeaks(input);

    assertArrayEquals(input, peak);
  }

  @Test
  void test_findValleys() {
    int[] input = new int[] {2, 3, 5, 1, 4, 3, 6, 7, 9, 8};
    int[] valleys = findValleys(input);

    assertArrayEquals(input, valleys);
  }
}
