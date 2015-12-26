package salikhov.ruslan.AbstractFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nil on 27.12.15.
 */
public class PrinterTest {
    private LettersPrinterFactory lettersFactory;
    private DigitsPrinterFactory digitsFactory;

    @Before
    public void setUp() throws Exception {
        lettersFactory = new LettersPrinterFactory();
        digitsFactory = new DigitsPrinterFactory();
    }

    @Test
    public void lettersFactory() {
        Printer printer = new Printer();
        printer.init(lettersFactory);

        assertEquals(printer.getLine(), lettersFactory.createLinePrinter().DATA);
        assertEquals(printer.getSquare(), lettersFactory.createSquarePrinter().DATA);
    }

    @Test
    public void digitsFactory() {
        Printer printer = new Printer();
        printer.init(digitsFactory);

        assertEquals(printer.getLine(), digitsFactory.createLinePrinter().DATA);
        assertEquals(printer.getSquare(), digitsFactory.createSquarePrinter().DATA);
    }
}