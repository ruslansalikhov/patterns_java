package salikhov.ruslan.AbstractFactory;

/**
 * Created by nil on 20.12.15.
 */
public class LettersPrinterFactory extends AbstractPrinterFactory {
    LettersLine createLinePrinter() {
        return new LettersLine();
    }

    LettersSquare createSquarePrinter() {
        return new LettersSquare();
    }
}
