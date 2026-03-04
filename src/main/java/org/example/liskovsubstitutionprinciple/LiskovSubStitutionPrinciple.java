package org.example.liskovsubstitutionprinciple;

public class LiskovSubStitutionPrinciple {
    public static void main(String[] args) {
      Bird sparrow = new Sparrow();
      sparrow.eat();
      Fly f = new Sparrow();
      f.flyable();

      Bird ostrish= new Bird();
      ostrish.eat();

    }
}
