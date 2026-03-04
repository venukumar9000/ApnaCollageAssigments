package org.example.interfacesagregration;

public class NormalPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Normal printing....");
    }
}
