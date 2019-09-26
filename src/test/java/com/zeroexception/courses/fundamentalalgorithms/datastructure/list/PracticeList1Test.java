package com.zeroexception.courses.fundamentalalgorithms.datastructure.list;

import static com.zeroexception.courses.fundamentalalgorithms.datastructure.list.PracticeList1.sortEmployeeBySalary;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author Viet Quoc Tran vt on 2019-09-25. www.zeroexception.com
 */
class PracticeList1Test {

  @Test
  void test_sortEmployeeBySalary() {
    Employee employee1 = new Employee();

    List<Employee> employees = new ArrayList<>();
    List<Employee> sortedList = sortEmployeeBySalary(employees);


  }

  @Test
  void test_classifySeniority() {

  }
}