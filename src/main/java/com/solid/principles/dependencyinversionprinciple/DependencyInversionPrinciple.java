package com.solid.principles.dependencyinversionprinciple;

public class DependencyInversionPrinciple {

  public static void main(String[] args) {
    ShoppingMall shoppingMall = new ShoppingMall(new DebitCard());
    shoppingMall.doTransaction(10000);
    shoppingMall = new ShoppingMall(new CreditCard());
    shoppingMall.doTransaction(2000);
  }
}
