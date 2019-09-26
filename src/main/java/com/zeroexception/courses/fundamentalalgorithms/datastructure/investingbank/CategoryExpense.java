package com.zeroexception.courses.fundamentalalgorithms.datastructure.investingbank;

/**
 * @author Viet Quoc Tran vt on 2019-09-19. www.zeroexception.com
 */
public class CategoryExpense {

  private String category;
  private double totalExpense;


  public String getCategory() {
    return category;
  }

  public CategoryExpense setCategory(String category) {
    this.category = category;
    return this;
  }

  public double getTotalExpense() {
    return totalExpense;
  }

  public CategoryExpense setTotalExpense(double totalExpense) {
    this.totalExpense = totalExpense;
    return this;
  }
}
