package salikhov.ruslan.AbstractFactory;

/**
 * Created by nil on 20.12.15.
 */
public class LettersLine implements AbstractLine {

    static final String DATA = "abcdefghijklmnopqrstuvwxyz";

    public String getString() {
        return DATA;
    }
}
