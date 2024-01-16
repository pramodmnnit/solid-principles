package com.solid.principles.liskovsubstitutionprinciple;

public class Penguin extends Bird {

  @Override
  public void eat() {
    System.out.println("Penguin bird can eat");
  }
}
