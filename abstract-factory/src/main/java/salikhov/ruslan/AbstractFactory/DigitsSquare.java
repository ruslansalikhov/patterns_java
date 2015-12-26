package salikhov.ruslan.AbstractFactory;

/**
 * Created by nil on 20.12.15.
 */
public class DigitsSquare implements AbstractSquare {

    static final String DATA = "1234\n" +
            "5  6\n" +
            "7890";

    @Override
    public String getString() {
        return DATA;
    }
}
