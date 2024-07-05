package com.solid.principles.liskovsubstitutionprinciple;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrinciple {

  public static void letBirdsFly(List<Bird> birds) {
    birds.forEach(Bird::move);
  }

  public static void main(String[] args) {
    List<Bird> birds = new ArrayList<>();
    birds.add(new FlyingBird());
    birds.add(new Swan());
    birds.add(new Penguin());
    letBirdsFly(birds);
  }
}
