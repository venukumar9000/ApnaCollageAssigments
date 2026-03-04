package org.example.dependencyinversionprinciple;

public class MachineKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("machineKeyboaring is typing....");
    }
}
