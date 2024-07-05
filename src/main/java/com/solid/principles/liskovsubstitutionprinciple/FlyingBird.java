package com.solid.principles.liskovsubstitutionprinciple;

public class FlyingBird extends Bird {

  @Override
  public void move() {
    System.out.println("I can fly");
  }
}
