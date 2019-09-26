package com.zeroexception.courses.fundamentalalgorithms.datastructure.list;

/**
 * @author Viet Quoc Tran vt on 2019-09-25. www.zeroexception.com
 */
public class Employee {


  private String name;
  private int age;
  private  Seniority seniority;
  private double salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Seniority getSeniority() {
    return seniority;
  }

  public void setSeniority(
      Seniority seniority) {
    this.seniority = seniority;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
