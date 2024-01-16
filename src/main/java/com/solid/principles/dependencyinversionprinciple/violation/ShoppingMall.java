package com.solid.principles.dependencyinversionprinciple.violation;

/**
 * This class violates the dependency inversion principle because this class is tightly coupled with
 * Debit card. If we want to change the card then we will need to make the changes in Shopping mall
 * class. To fix this violation, we will create the interface or abstract class and we will use same
 * here
 */
public class ShoppingMall {
  private final DebitCard debitCard;

  public ShoppingMall(DebitCard debitCard) {
    this.debitCard = debitCard;
  }

  public void doTransaction(int amount) {
    debitCard.doTransaction(amount);
  }
}
