package com.solid.principles.liskovsubstitutionprinciple.violation;

/**
 * This class violates the LSP because if we try to replace base class object by derived class
 * objects program will not work as expected. It will throw exception
 */
public class Penguin extends Bird {

  @Override
  public void eat() {
    System.out.println("Penguin bird can eat");
  }

  @Override
  public void fly() {
    throw new RuntimeException("Penguin can't fly");
  }
}
