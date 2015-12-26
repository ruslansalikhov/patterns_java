package salikhov.ruslan.AbstractFactory;

import java.util.ArrayList;

public class Printer {

    private AbstractLine line;
    private AbstractSquare square;

    public void init(final AbstractPrinterFactory factory) {
        line = factory.createLinePrinter();
        square = factory.createSquarePrinter();
    }

    public String getLine() {
        return line.getString();
    }

    public String getSquare() {
        return square.getString();
    }

    public static void main(String[] args) {
        ArrayList<AbstractPrinterFactory> printers = new ArrayList<AbstractPrinterFactory>();
        printers.add(new DigitsPrinterFactory());
        printers.add(new LettersPrinterFactory());

        for (AbstractPrinterFactory factory : printers) {

            Printer printer = new Printer();
            printer.init(factory);

            String line = printer.getLine();
            System.out.println("Line: " + line);

            String square = printer.getSquare();
            System.out.println("Square:\n" + square);

            System.out.println();
        }

    }
}
