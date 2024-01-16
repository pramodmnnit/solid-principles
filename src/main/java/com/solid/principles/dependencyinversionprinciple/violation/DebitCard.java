package com.solid.principles.dependencyinversionprinciple.violation;

public class DebitCard {

  public void doTransaction(int amount) {
    System.out.println("Doing debit card transaction for amount:" + amount);
  }
}
