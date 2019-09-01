package com.zeroexception.courses.fundamentalalgorithms.stringmanipulation;

import java.util.regex.Pattern;

public interface PatternMatching {

  /**
   * A valid sentence has to start with a capital letter and end with a period.
   * @param sentence
   * @return true if the sentence is valid, otherwise return false.
   */
  static boolean isValidSentence1(String sentence){
    String regex = "([A-Z])(.+)(\\.)";
    return sentence.matches(regex);
  }

  /**
   * A sentence has to contain a verb to be in present form.
   * @param sentence
   * @return true if there is a verb in present, otherwise return false.
   */
  static boolean isToBePresent(String sentence){

    String regex  = "([A-Z])(.+)(is|are|am)(.+)(\\.)";
    return sentence.matches(regex);

  }

  static String replaceDollarBySign(String paragraph){

//    return paragraph.replaceAll("(dollars|Dollars|dollar|Dollar)", "\\$");
    return paragraph.replaceAll("(d|D)(ollar)(s{0,1})", "\\$");
  }

}
