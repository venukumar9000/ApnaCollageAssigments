package org.example.interfacesagregration;

public class InterfaceSagregation {
    public static void main(String[] args) {
        Printer printer= new MultiPrinter();
        printer.print();
        Scanner scanner= new MultiPrinter();
        scanner.scan();

        Printer normalPrinter= new NormalPrinter();
        normalPrinter.print();

    }
}
