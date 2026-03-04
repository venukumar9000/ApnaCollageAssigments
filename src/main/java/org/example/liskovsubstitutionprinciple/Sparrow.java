package org.example.liskovsubstitutionprinciple;

public class Sparrow extends Bird implements Fly{
    @Override
    public void flyable() {
        System.out.println("sparrow is flying");
    }
}
