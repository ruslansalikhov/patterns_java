package salikhov.ruslan.AbstractFactory;

/**
 * Created by nil on 20.12.15.
 */
public class LettersSquare implements AbstractSquare {

    static final String DATA = "abcdefg\n" +
            "h     i\n" +
            "j     k\n" +
            "l     m\n" +
            "n     o\n" +
            "p     q\n" +
            "r     s\n" +
            "tuvwxyz";

    @Override
    public String getString() {
        return DATA;
    }
}
