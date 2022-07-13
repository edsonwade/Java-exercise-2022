package mindswap.academy._004_pilares_da_oop.calculators;

public class Application {
    public static void main(String[] args) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        System.out.println("Result :" + addition.execute(2, 3));
        System.out.println("Result :" + subtraction.execute(24, 3));
        System.out.println("Result :" + multiplication.execute(12, 3));
        System.out.println("Result :" + division.execute(21, 4));

    }

    /*
     * Abstract -> is one of the pillars of the oop , in which a class cannot be instantiated and defined an abstract methods
     * that has to be implemented by the class that inheritance for them.
     *
     * this type of class can be inheritance.
     *
     * Inheritance -> is type of association in which a class inheritance properties and methods
     * of the other.
     *
     * Polymorphism-> when two or more objects implements the same methods but each one will have different behavior.
     *
     * Account()
     * SaveAccount()
     *
     * this type of class can be instantiated.
     * a class can only be inherit for one class.
     *
     * the access modified can be (protected ,public ,public ,default)
     *
     * Protected -> is type of access that can be access inside of the class where is declared,
     * same package , and only  by the class that inherit for the class that is declared.
     *
     * Private -> means encapsulate the attribute of this class
     * can be access by the other class , or outside of the package.
     * to have access to this properties we need to implements getter and setter(making public).
     *
     * public -> mean that can be access anywhere, by any class , and outside of the package.
     *
     * default: can only be access inside of the class and in same package.
     *
     * abstract methods are like a contract done by the class that implemented .
     *
     *
     * */
}
