package mindswap.academy._004_pilares_da_oop.calculators;

import java.io.Serializable;

public abstract class Calculator implements Serializable {
    protected abstract Integer  execute(int number1, int number2);
}
