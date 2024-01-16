package com.solid.principles.openclosedprinciple.violation;

import com.solid.principles.openclosedprinciple.Invoice;

/**
 * This class violates the open closed principle because if we want to save invoice to database, we
 * will need to modify this class. We will address this issue and create the interface/abstract
 * class. We will have different implementation for each type
 */
public class InvoicePersistence {

  private final Invoice invoice;

  public InvoicePersistence(Invoice invoice) {
    this.invoice = invoice;
  }

  public void saveToFile(String filename) {
    System.out.println("Saving invoice to file: " + filename);
  }
}
