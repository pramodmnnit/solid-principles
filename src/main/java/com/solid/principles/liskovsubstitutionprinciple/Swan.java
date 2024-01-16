package com.solid.principles.liskovsubstitutionprinciple;

public class Swan extends FlyingBird {

  @Override
  public void eat() {
    System.out.println("Swan bird can eat");
  }

  @Override
  public void fly() {
    System.out.println("Swan bird can fly");
  }
}
