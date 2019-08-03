package com.zeroexception.courses.fundamentalalgorithms.stringmanipulation;

import static com.zeroexception.courses.fundamentalalgorithms.stringmanipulation.StringBasic01.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringBasic01Test {

  @Test
  void isPalindromeTest1() {
    assertTrue(isPalindrome("abba"));
  }

  @Test
  void isPalindromeTest2() {
    assertTrue(isPalindrome("x"));
  }

  @Test
  void isPalindromeTest3() {
    assertTrue(isPalindrome("radar"));
  }

  @Test
  void isPalindromeTest4() {
    assertTrue(isPalindrome("mom"));
  }
}