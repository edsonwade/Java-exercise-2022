package mindswap.academy._004_pilares_da_oop.utils;

public class RandomUtil {

    public static double generateRandomNumber(double min, double max) {
        return (Math.random() * (max - min + 1.0) + min);
    }
}
