package com.solid.principles.liskovsubstitutionprinciple;

public class Penguin extends Bird {

  @Override
  public void move() {
    System.out.println("Penguin bird can move");
  }
}
