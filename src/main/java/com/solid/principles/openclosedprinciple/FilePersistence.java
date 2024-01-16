package com.solid.principles.openclosedprinciple;

public class FilePersistence implements InvoicePersistence {

  @Override
  public void save(Invoice invoice) {
    System.out.println("Saving invoice to file");
  }
}
