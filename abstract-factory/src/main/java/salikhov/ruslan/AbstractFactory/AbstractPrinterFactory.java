package salikhov.ruslan.AbstractFactory;

/**
 * Created by nil on 20.12.15.
 */
abstract class AbstractPrinterFactory {
    abstract AbstractLine createLinePrinter();
    abstract AbstractSquare createSquarePrinter();
}
