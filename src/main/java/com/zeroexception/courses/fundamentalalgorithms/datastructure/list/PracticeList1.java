package com.zeroexception.courses.fundamentalalgorithms.datastructure.list;


import java.util.Collections;
import java.util.List;

/**
 * Using List, ArrayList, LinkedList or array to solve following problem
 */
public interface PracticeList1 {

  /**
   * Sort input list of employee by salary.
   * Using built-in sort function of java list or collections
   * Using Comparator to pick the field which we want to sort by
   */
  static List<Employee> sortEmployeeBySalary(List<Employee> employeeList) {
    return Collections.emptyList();
  }


  /**
   * Given a list of Employees.
   * Put them into different group, each group of employees will have the same level of seniority
   * Use list to store employees who belong to the same group
   * Inside each group sort employees by their salary.
   *
   *
   * Return a list of these group.
   * Sort the return list by seniority level. from Junior to Senior
   * @param employeeList
   * @return list of group of employee ( in form of list)
   */
  static List<List<Employee>> classifySeniority(List<Employee> employeeList) {
    return Collections.emptyList();
  }



  /**
   * Given an article as a String.
   * the article contains a lot of words.
   * Return a list of words, sorted by its appearance in the articles, descending order
   * (The words appears most come first, the word appears least come last.
   *
   * @param paragraph the article
   * @return list of words sorted by appearance.
   */

  static List<String> sortWordByAppearance(String paragraph) {
    return Collections.emptyList();
  }



































}
