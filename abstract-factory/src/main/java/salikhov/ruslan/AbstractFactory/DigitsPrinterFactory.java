package salikhov.ruslan.AbstractFactory;

/**
 * Created by nil on 20.12.15.
 */
public class DigitsPrinterFactory extends AbstractPrinterFactory {
    DigitsLine createLinePrinter() {
        return new DigitsLine();
    }

    DigitsSquare createSquarePrinter() {
        return  new DigitsSquare();
    }

}
