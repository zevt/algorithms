package com.zeroexception.courses.fundamentalalgorithms.stringmanipulation;

import static com.zeroexception.courses.fundamentalalgorithms.stringmanipulation.PatternMatching.isToBePresent;
import static com.zeroexception.courses.fundamentalalgorithms.stringmanipulation.PatternMatching.isValidSentence1;
import static com.zeroexception.courses.fundamentalalgorithms.stringmanipulation.PatternMatching.replaceDollarBySign;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PatternMatchingTest {

  @Test
   void valueSentence1Test() {
    String sentence = "The table is big.";
    boolean result = isValidSentence1(sentence);
    assertTrue(result);

  }

  @Test
   void valueSentenceOneTest2() {
    String sentence = "the table is big.";
    boolean result = isValidSentence1(sentence);
    assertFalse(result);

  }

  @Test
  void isToBePresentTest(){
    String sentence = "The table is big.";
    boolean result = isToBePresent(sentence);
    assertTrue(result);
  }

  @Test
  void isToBePresentTest2(){
    String sentence = "The cats are small.";
    boolean result = isToBePresent(sentence);
    assertTrue(result);
  }

  @Test
  void replaceDollarBySignTest(){
    String paragraph = "The US dollar is high.";
    String output = "The US $ is high.";
    assertEquals(output, replaceDollarBySign(paragraph));
  }
  @Test
  void replaceDollarBySignTest2(){
    String paragraph = "The US Dollar is high.";
    String output = "The US $ is high.";
    assertEquals(output, replaceDollarBySign(paragraph));
  }

  @Test
  void replaceDollarBySignTest3(){
    String paragraph = "The US Dollars is high.";
    String output = "The US $ is high.";
    assertEquals(output, replaceDollarBySign(paragraph));
  }

  @Test
  void replaceDollarBySignTest4(){
    String paragraph = "The US dollars is high.";
    String output = "The US $ is high.";
    assertEquals(output, replaceDollarBySign(paragraph));
  }
}