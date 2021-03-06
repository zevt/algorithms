package com.zeroexception.courses.fundamentalalgorithms.datastructure;

import static com.zeroexception.courses.fundamentalalgorithms.datastructure.Sorting.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortingTest {


  @BeforeEach
  void setUp() {

  }

  @Test
  public void selectionSortTest() {

    int[] a = new int[] {1, 4, 6, 9, 4, 0};
    selectionSort(a);

    assertArrayEquals(a, new int[] {0, 1, 4, 4, 6, 9});

  }

  @Test void bubbleSortTest() {
    int[] a = new int[] {1, 4, 6, 9, 4, -4};
    bubbleSort(a);

    assertArrayEquals(a, new int[] {-4, 1, 4, 4, 6, 9});
  }
}