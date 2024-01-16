package com.solid.principles.openclosedprinciple;

public class DatabasePersistence implements InvoicePersistence {

  @Override
  public void save(Invoice invoice) {
    System.out.println("Saving invoice to database");
  }
}
