package com.solid.principles.singleresponsibilityprinciple;

/** This is simple book class */
public class Book {
  private final String name;
  private final String author;
  private final String isbn;
  private final double price;
  private final int year;

  public Book(String name, String author, String isbn, int price, int year) {
    this.name = name;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public String getIsbn() {
    return isbn;
  }

  public double getPrice() {
    return price;
  }

  public int getYear() {
    return year;
  }
}
