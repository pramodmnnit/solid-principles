package com.solid.principles.liskovsubstitutionprinciple;

public class Swan extends FlyingBird {

  @Override
  public void move() {
    System.out.println("Swan bird can fly");
  }
}
