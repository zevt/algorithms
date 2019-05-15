package com.zeroexception.courses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortingTest {

  private Sorting sort = new Sorting();

  @BeforeEach
  void setUp() {

  }

  @Test
  public void selectionSort() {

    int[] a = new int[] {1, 4, 6, 9, 4, 0};
    int[] b = sort.selectionSort(a);

    assertArrayEquals(b, new int[] {0, 1, 4, 4, 6, 9});

  }

  @Test void bubbleSort() {
    int[] a = new int[] {1, 4, 6, 9, 4, 0};
    int[] b = sort.bubbleSort(a);

    assertArrayEquals(b, new int[] {0, 1, 4, 4, 6, 9});
  }
}