package com.zeroexception.courses.fundamentalalgorithms.datastructure;


public interface Sorting {


  static void selectionSort(int[] a) {

    for (int i = 0; i < a.length - 1; ++i) {
      int min = a[i];
      int index = i;
      for (int j = i+1; j < a.length; ++j) {
        if (min > a[j]) {
          min = a[j];
          index = j;
        }
      }
      if (index != i) {
        int t = a[index];
        a[index] = a[i];
        a[i] = t;
      }
    }
  }


  static void bubbleSort(int[] a) {
    for (int i = 0; i < a.length - 1; ++i) {
      for (int j = a.length - 1; j > 0;--j) {
        if (a[j] < a[j - 1]) {
          int tempt = a[j];
          a[j] = a[j - 1];
          a[j - 1] = tempt;
        }
      }
    }
  }

  static void insertionSort(int[] a) {
  }


  static void mergeSort(int[] a) {
  }


  static void quickSort(int[] a) {
  }

  


}
