package com.solid.principles.dependencyinversionprinciple;

public class CreditCard implements BankCard {

  @Override
  public void doTransaction(int amount) {
    System.out.println("Making payment through credit card for amount:" + amount);
  }
}
