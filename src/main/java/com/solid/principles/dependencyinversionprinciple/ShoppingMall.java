package com.solid.principles.dependencyinversionprinciple;

public class ShoppingMall {
  private final BankCard bankCard;

  public ShoppingMall(BankCard bankCard) {
    this.bankCard = bankCard;
  }

  public void doTransaction(int amount) {
    bankCard.doTransaction(amount);
  }
}
