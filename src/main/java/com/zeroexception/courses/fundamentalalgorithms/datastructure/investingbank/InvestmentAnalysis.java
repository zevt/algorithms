package com.zeroexception.courses.fundamentalalgorithms.datastructure.investingbank;

import java.util.Collections;
import java.util.List;

/**
 * @author Viet Quoc Tran vt on 2019-09-19. www.zeroexception.com
 */
public class InvestmentAnalysis {

  private List<Expense> expenseList;


  public List<Expense> getExpenseList() {
    return expenseList;
  }

  public InvestmentAnalysis setExpenseList(
      List<Expense> expenseList) {
    this.expenseList = expenseList;
    return this;
  }

  /**
   * Return sorted list of Category expense by total spending by category
   * @return
   */
  public List<String> classifyExpense() {

    // provide implementation here
    return Collections.emptyList();
  }




}
