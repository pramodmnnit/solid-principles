package com.solid.principles.openclosedprinciple;

public class InvoicePersistenceFactory {

  public static InvoicePersistence getInvoicePersistence(PersistenceType type) {
    if (PersistenceType.FILE.equals(type)) {
      return new FilePersistence();
    } else if (PersistenceType.DATABASE.equals(type)) {
      return new DatabasePersistence();
    } else {
      throw new RuntimeException("Type is not supported");
    }
  }
}
