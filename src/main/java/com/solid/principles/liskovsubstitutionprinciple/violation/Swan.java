package com.solid.principles.liskovsubstitutionprinciple.violation;

public class Swan extends Bird {

  @Override
  public void eat() {
    System.out.println("Swan bird can eat");
  }

  @Override
  public void fly() {
    System.out.println("Swan bird can fly");
  }
}
