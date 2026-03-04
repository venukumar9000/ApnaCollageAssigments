package org.example.dependencyinversionprinciple;

public class Computer {
    private Keyboard keyboard;

    Computer(Keyboard keyboard){
        this.keyboard=keyboard;

    }
    public void use(){
        keyboard.type();
    }

}
