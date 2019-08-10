package com.zeroexception.courses.fundamentalalgorithms.stringmanipulation;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public interface LongestString {

  /**
   * Given an array of String,
   * return the list of longest String from the input array of String
   * Example:
   * input = ["no", "yes","x","opp", "now"]
   * output is a list: ["yes","opp","now"]
   *
   * Example:
   * input = ["know", "bad", "good"]
   * output = ["know", "good"]
   */
  static List<String> longestStrings(String[] inputs) {
    List<String> list = new LinkedList<>();
    int maxLength = 0;
    for (String s: inputs) {
      if (s.length() == maxLength) {
        list.add(s);
      } else if (s.length() > maxLength) {
        list.clear();
        list.add(s);
        maxLength = s.length();
      }
    }
    String[] sss= list.toArray(new String[] {});
    return Arrays.asList(sss);
  }
}
