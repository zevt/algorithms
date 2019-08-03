package com.zeroexception.courses.fundamentalalgorithms.datastructure;

import static org.junit.jupiter.api.Assertions.*;

import com.zeroexception.courses.fundamentalalgorithms.Sorting;
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
    sort.selectionSort(a);

    assertArrayEquals(a, new int[] {0, 1, 4, 4, 6, 9});

  }

  @Test void bubbleSort() {
    int[] a = new int[] {1, 4, 6, 9, 4, -4};
    sort.bubbleSort(a);

    assertArrayEquals(a, new int[] {-4, 1, 4, 4, 6, 9});
  }
}