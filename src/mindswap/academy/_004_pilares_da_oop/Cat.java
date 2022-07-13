package mindswap.academy._004_pilares_da_oop;

public class Cat extends Animal {


    @Override
    protected String sing() {
        return null;
    }

    /* overloading-> implements the same methods but with different signature. */
    public String sing(String name) {
        return null;
    }

    @Override
    protected String walk() {
        return null;
    }
}
