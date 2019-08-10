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

  @Test
  void testSentenceCount() {
    String paragraph = "I have 2 pets, a cat and a dog. The cat's name is Milo. The dog's name is Ricky";
    assertEquals(3, sentenceCount(paragraph));
  }

  @Test
  void testCorrectParagraph_should_correct_non_capital_letter() {
    String paragraph = "i have 2 pets, a cat  and a dog. the cat's name is Milo. the dog's name is Ricky";
    String correctedParagraph = correctParagraph(paragraph);
    String result = "I have 2 pets, a cat  and a dog. The cat's name is Milo. The dog's name is Ricky";
    assertEquals(correctedParagraph, result);
  }

  @Test
  void testCorrectParagraph_should_correct_space_before_commas_and_period() {
    String paragraph = "i have 2 pets , a cat  and a dog. the cat's name is Milo . the dog's name is Ricky";
    String correctedParagraph = correctParagraph(paragraph);
    String result = "I have 2 pets, a cat  and a dog. The cat's name is Milo. The dog's name is Ricky";
    assertEquals(correctedParagraph, result);
  }

  @Test
  void testCorrectParagraph_should_correct_space_after_commas_and_period() {
    String paragraph = "i have 2 pets , a cat  and a dog. the cat's name is Milo . the dog's name is Ricky";
    String correctedParagraph = correctParagraph(paragraph);
    String result = "I have 2 pets, a cat  and a dog. The cat's name is Milo. The dog's name is Ricky";
    assertEquals(correctedParagraph, result);
  }

  @Test
  void testCountAppearances() {
    String article =
        "Business Insider teamed up with Zillow's rental site, HotPads, to find the median rent for a one-bedroom apartment in each of the 49 US metro areas with the largest populations (as determined by Zillow). We also used Data USA to find the median household income in each of these areas.\n"
            + "\n"
            + "The data was compiled using HotPad's Repeat Rent Index. Each of the one-bedroom apartments analyzed in the study has been listed for rent on HotPads for longer than a month.";

    String keyword = "one-bedroom";
    assertEquals(2, countAppearances(article, keyword));
  }
}