package com.zeroexception.courses.fundamentalalgorithms.datastructure.list;

import static com.zeroexception.courses.fundamentalalgorithms.datastructure.list.PracticeList1.sortEmployeeBySalary;
import static com.zeroexception.courses.fundamentalalgorithms.datastructure.list.PracticeList1.sortWordByAppearance;

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


  @Test
  void test_sortWordByAppearance() {
    String paragraph = "The report concludes that the world’s oceans and ice sheets are under such severe stress that the fallout could prove difficult for humans to contain without steep reductions in greenhouse gas emissions. Fish populations are already declining in many regions as warming waters throw marine ecosystems into disarray, according to the report by the Intergovernmental Panel on Climate Change, a group of scientists convened by the United Nations to guide world leaders in policymaking";


    List<String> sortedWords = sortWordByAppearance(paragraph);



  }
}