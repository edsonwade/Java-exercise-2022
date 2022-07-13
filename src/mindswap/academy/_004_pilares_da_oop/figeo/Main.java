package mindswap.academy._004_pilares_da_oop.figeo;

import mindswap.academy._004_pilares_da_oop.utils.RandomUtil;

public class Main {

    static final double base = RandomUtil.generateRandomNumber(0.0, 100.0);
    static final double height = RandomUtil.generateRandomNumber(0.0, 100.0);


    public static void main(String[] args) {

        final double rad = 234.56;

        System.out.println(" base random valor generate :" + base);
        System.out.println(" height random valor generate :" + height);

        System.out.println("\n");

        System.out.printf("Are of Triangle is :%.2f ", FigGeometric.areaOfTriangle(base, height));
        System.out.println("\n");
        System.out.printf("Area of Rectangle is :%.3f ", FigGeometric.areaOfRectangle(base, height));
        System.out.println("\n");
        System.out.printf("Are of Circle is : %.4f", FigGeometric.areaCircle(rad));

    }


}
