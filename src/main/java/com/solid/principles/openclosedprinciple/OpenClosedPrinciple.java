package com.solid.principles.openclosedprinciple;

public class OpenClosedPrinciple {

  public static void main(String[] args) {
    Book book = new Book("Mathematics", "R D Sharma", "isbn number", 500, 2022);
    Invoice invoice = new Invoice(book, 12, 0.10, 0.20);
    InvoicePersistence invoicePersistence =
        InvoicePersistenceFactory.getInvoicePersistence(PersistenceType.FILE);
    invoicePersistence.save(invoice);
    invoicePersistence = InvoicePersistenceFactory.getInvoicePersistence(PersistenceType.DATABASE);
    invoicePersistence.save(invoice);
  }
}
