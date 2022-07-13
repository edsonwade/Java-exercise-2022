package mindswap.academy._004_pilares_da_oop.figeo;

public final class FigGeometric {

    private static final Double PI = 3.14159;


    public static double areaOfTriangle(double base, double height) {
        return base * height / 2;

    }

    public static double areaCircle(double rad) {
        return PI * rad * rad;
    }

    //48,0902

    public static double areaOfRectangle(double base, double height) {
        return base * height;
    }

}
