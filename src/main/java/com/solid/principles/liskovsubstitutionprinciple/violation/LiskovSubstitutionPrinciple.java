package com.solid.principles.liskovsubstitutionprinciple.violation;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrinciple {

  public static void letBirdsFly(List<Bird> birds) {
    birds.forEach(Bird::fly);
  }

  public static void main(String[] args) {
    List<Bird> birds = new ArrayList<>();
    birds.add(new Bird());
    birds.add(new Swan());
    letBirdsFly(birds);
    // till this point there is no issue, now we will add penguin and it will violate the LSP
    birds.add(new Penguin());
    letBirdsFly(birds);
  }
}
