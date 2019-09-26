package com.zeroexception.courses.fundamentalalgorithms.datastructure;

import static com.zeroexception.courses.fundamentalalgorithms.datastructure.BasicStructure01.findPeaks;
import static com.zeroexception.courses.fundamentalalgorithms.datastructure.BasicStructure01.findValleys;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.zeroexception.courses.fundamentalalgorithms.datastructure.investingbank.CategoryExpense;
import com.zeroexception.courses.fundamentalalgorithms.datastructure.investingbank.Expense;
import com.zeroexception.courses.fundamentalalgorithms.datastructure.investingbank.InvestmentAnalysis;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/** @author Viet Quoc Tran vt on 2019-09-19. www.zeroexception.com */
class BasicStructure01Test {

  @Test
  void test_findPeaks() {
    int[] input = new int[] {2, 3, 5, 1, 4, 3, 6, 7, 9, 8};
    int[] peak = findPeaks(input);
    int[] output = new int[] {5, 4, 9};

    assertArrayEquals(output, peak);
  }

  @Test
  void test_findValleys() {
    int[] input = new int[] {2, 3, 5, 1, 4, 3, 6, 7, 9, 8};
    int[] valleys = findValleys(input);

    int[] output = new int[] {1, 3};

    assertArrayEquals(output, valleys);
  }

  @Test
  void testCategoryExpense() {
    CategoryExpense categoryExpense = new CategoryExpense();

    InvestmentAnalysis investmentAnalysis = new InvestmentAnalysis();

    List<Expense> expenseList = new ArrayList<>();

    expenseList.add(new Expense()
        .setItem("tea")
    .setCategory("Food and Beverage")
    .setExpense(8.0));

    expenseList.add(new Expense()
        .setItem("coffee")
        .setCategory("Food and Beverage")
        .setExpense(15.0));

    expenseList.add(new Expense()
        .setItem("gas")
        .setCategory("Utility")
        .setExpense(95.0));

    expenseList.add(new Expense()
        .setItem("hotel")
        .setCategory("Travel")
        .setExpense(65.0));

    expenseList.add(new Expense()
        .setItem("ipad")
        .setCategory("Electronics")
        .setExpense(450));



    investmentAnalysis.setExpenseList(expenseList);

    List<String> categoryExpenseList = investmentAnalysis.classifyExpense();

    assertArrayEquals(new String[] {"Electronics", "Utility", "Travel", "Food and Beverage"},
        categoryExpenseList.toArray(new String[categoryExpenseList.size()] ));


  }
}
