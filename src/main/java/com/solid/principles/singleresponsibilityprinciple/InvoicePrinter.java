package com.solid.principles.singleresponsibilityprinciple;

public class InvoicePrinter {
  /** This method print invoice details on console */
  public void printInvoice(Invoice invoice) {
    System.out.println("Book: " + invoice.getBook());
    System.out.println("quantity: " + invoice.getQuantity());
    System.out.println("totalPrice: " + invoice.getTotalPrice());
    System.out.println("taxRate: " + invoice.getTaxRate());
    System.out.println("discountRate: " + invoice.getDiscountRate());
  }
}
