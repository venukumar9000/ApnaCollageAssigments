package org.example.dependencyinversionprinciple;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        Keyboard keyboard= new MachineKeyboard();
        Computer computer = new Computer(keyboard);
        computer.use();
    }
}
