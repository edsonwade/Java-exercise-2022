package mindswap.academy._004_pilares_da_oop.calculators;

import java.io.Serializable;

public class Division extends Calculator implements Serializable {
    @Override
    protected Integer execute(int number1, int number2) {
        return number1 / number2;
    }

}
