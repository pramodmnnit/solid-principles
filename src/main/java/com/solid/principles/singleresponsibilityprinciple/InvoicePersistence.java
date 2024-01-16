package com.solid.principles.singleresponsibilityprinciple;

public class InvoicePersistence {

  private final Invoice invoice;

  public InvoicePersistence(Invoice invoice) {
    this.invoice = invoice;
  }

  public void saveToFile(String filename) {
    System.out.println("Saving invoice to file: " + filename);
  }
}
