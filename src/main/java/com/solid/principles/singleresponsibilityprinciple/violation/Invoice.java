package com.solid.principles.singleresponsibilityprinciple.violation;

import com.solid.principles.singleresponsibilityprinciple.Book;

/**
 * This is invoice class which stores logic to calculate price This class violates the single
 * responsibility principle at 2 places in this class. 1. print logic should not be here because
 * this class is responsible only for invoice 2. save to file should not be here because it violates
 * the SIP we will create 2 classes one for print invoice and another for save to file
 */
public class Invoice {
  private Book book;
  private int quantity;
  private double totalPrice;
  private double taxRate;
  private double discountRate;

  public Invoice(Book book, int quantity, double totalPrice, double taxRate, double discountRate) {
    this.book = book;
    this.quantity = quantity;
    this.totalPrice = totalPrice;
    this.taxRate = taxRate;
    this.discountRate = discountRate;
  }

  /** This method print invoice details on console */
  public void printInvoice() {
    System.out.println("Book: " + this.book);
    System.out.println("quantity: " + this.quantity);
    System.out.println("totalPrice: " + this.totalPrice);
    System.out.println("taxRate: " + this.taxRate);
    System.out.println("discountRate: " + this.discountRate);
  }

  private double calculateTotalPrice() {
    double pretaxTotalPrice =
        this.quantity * (this.book.getPrice() - this.book.getPrice() * this.discountRate);
    return pretaxTotalPrice * (1 + this.taxRate);
  }

  public void saveToFile(String filename) {
    System.out.println("Saving invoice to filename:" + filename);
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }

  public double getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(double discountRate) {
    this.discountRate = discountRate;
  }
}
