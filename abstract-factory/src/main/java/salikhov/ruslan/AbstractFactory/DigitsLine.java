package salikhov.ruslan.AbstractFactory;

/**
 * Created by nil on 20.12.15.
 */
public class DigitsLine implements AbstractLine {

    static final String DATA = "1234567890";

    @Override
    public String getString() {
        return DATA;
    }

}
