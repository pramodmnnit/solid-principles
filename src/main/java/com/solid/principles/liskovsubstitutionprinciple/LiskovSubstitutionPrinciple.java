package com.solid.principles.liskovsubstitutionprinciple;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrinciple {

  public static void letBirdsFly(List<FlyingBird> birds) {
    birds.forEach(FlyingBird::fly);
  }

  public static void main(String[] args) {
    List<FlyingBird> birds = new ArrayList<>();
    birds.add(new FlyingBird());
    birds.add(new Swan());
    letBirdsFly(birds);
  }
}
