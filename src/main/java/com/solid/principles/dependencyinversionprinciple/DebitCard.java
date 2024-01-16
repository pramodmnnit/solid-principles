package com.solid.principles.dependencyinversionprinciple;

public class DebitCard implements BankCard {

  @Override
  public void doTransaction(int amount) {
    System.out.println("Making payment through debit card for amount:" + amount);
  }
}
