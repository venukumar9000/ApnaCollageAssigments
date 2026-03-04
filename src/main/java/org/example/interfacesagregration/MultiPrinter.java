package org.example.interfacesagregration;

public class MultiPrinter implements Printer,Scanner{
    @Override
    public void print() {
        System.out.println("printing .....");
    }

    @Override
    public void scan() {
        System.out.println("sacnning.....");
    }
}
