package com.zeroexception.courses;


public class Sorting {


  public int[] selectionSort(int[] a) {

    int[] b = clone(a);

    for (int i = 0; i < b.length - 1; ++i) {
      int min = b[i];
      int index = i;
      for (int j = i+1; j < b.length; ++j) {
        if (min > b[j]) {
          min = b[j];
          index = j;
        }
      }
      if (index != i) {
        int t = b[index];
        b[index] = b[i];
        b[i] = t;
      }
    }
    return b;
  }


  public int[] bubbleSort(int[] a) {
    return null;
  }

  private int[]  clone(int a[]) {
    int[] b = new int[a.length];
    for (int i = 0; i < a.length; ++i) {
      b[i] = a[i];
    }
    return b;
  }


}
