package com.solid.principles.liskovsubstitutionprinciple.violation;

/**
 * LSP: It’s the ability to replace any object of a parent class with any object of one of its child
 * classes without affecting the correctness of the program. To fix this violation, we will have two
 * classes one for birds which fly and another for eat
 */
public class Bird {
  public void fly() {
    System.out.println("I can fly");
  }
}
