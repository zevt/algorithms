package com.zeroexception.courses.fundamentalalgorithms.datastructure.investingbank;

/**
 * @author Viet Quoc Tran vt on 2019-09-19. www.zeroexception.com
 */
public class Expense {
  private double expense;
  private String item; 
  private String category;



  public double getExpense() {
    return expense;
  }

  public Expense setExpense(double expense) {
    this.expense = expense;
    return this;
  }

  public String getItem() {
    return item;

  }

  public Expense setItem(String item) {
    this.item = item;
    return this;
  }

  public String getCategory() {
    return category;
  }

  public Expense setCategory(String category) {
    this.category = category;
    return this;
  }
}
