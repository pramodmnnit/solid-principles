package com.solid.principles.singleresponsibilityprinciple;

public class SingleResponsibilityPrinciple {

  public static void main(String[] args) {
    Book book = new Book("Mathematics", "R D Sharma", "isbn number", 500, 2022);
    Invoice invoice = new Invoice(book, 12, 0.10, 0.20);
    InvoicePrinter invoicePrinter = new InvoicePrinter();
    invoicePrinter.printInvoice(invoice);
    InvoicePersistence invoicePersistence = new InvoicePersistence(invoice);
    invoicePersistence.saveToFile("invoicefile");
  }
}
