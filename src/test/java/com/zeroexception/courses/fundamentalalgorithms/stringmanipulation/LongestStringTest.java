package com.zeroexception.courses.fundamentalalgorithms.stringmanipulation;

import static com.zeroexception.courses.fundamentalalgorithms.stringmanipulation.LongestString.longestStrings;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author Viet Quoc Tran vt on 2019-08-03. www.zeroexception.com
 */
class LongestStringTest {


  @Test
  public void longestStringsTest1() {
    String[] input = new String[] {"no", "yes","x","opp", "now"};
    List<String> output = Arrays.asList("yes","opp","now");

    assertEquals(output, longestStrings(input));
  }

  @Test
  public void longestStringsTest2() {
    String[] input = new String[] {"know", "bad", "good"};
    List<String> output = Arrays.asList("know", "good");

    assertEquals(output, longestStrings(input));
  }

}