package mindswap.academy._004_pilares_da_oop.calculators;

public class Multiplication extends Calculator {
    @Override
    protected Integer execute(int number1, int number2) {
        return number1 * number2;
    }
}
