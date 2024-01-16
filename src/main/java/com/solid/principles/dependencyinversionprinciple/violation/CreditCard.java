package com.solid.principles.dependencyinversionprinciple.violation;

public class CreditCard {

  public void doTransaction(int amount) {
    System.out.println("Doing credit card transaction for amount:" + amount);
  }
}
