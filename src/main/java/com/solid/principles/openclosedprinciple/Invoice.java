package com.solid.principles.openclosedprinciple;

public class Invoice {
  private final Book book;
  private final int quantity;
  private final double totalPrice;
  private final double taxRate;
  private final double discountRate;

  public Invoice(Book book, int quantity, double taxRate, double discountRate) {
    this.book = book;
    this.quantity = quantity;
    this.taxRate = taxRate;
    this.discountRate = discountRate;
    this.totalPrice = this.calculateTotalPrice();
  }

  private double calculateTotalPrice() {
    double pretaxTotalPrice =
        this.quantity * (this.book.getPrice() - this.book.getPrice() * this.discountRate);
    return pretaxTotalPrice * (1 + this.taxRate);
  }

  public Book getBook() {
    return book;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public double getTaxRate() {
    return taxRate;
  }

  public double getDiscountRate() {
    return discountRate;
  }
}
