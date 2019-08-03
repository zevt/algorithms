package com.zeroexception.courses.fundamentalalgorithms.stringmanipulation;


import java.util.ArrayList;
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
    int longest = 0;
    for(int i = 0; i < inputs.length; i++){
      if(inputs[i].length() > longest){
        longest = inputs[i].length();
      }
    }
    List<String> longStrings = new ArrayList<>();

    for(int i = 0; i < inputs.length; i++) {
      if(inputs[i].length() == longest){
        longStrings.add(inputs[i]);
      }
    }
    return longStrings;
  }
}
