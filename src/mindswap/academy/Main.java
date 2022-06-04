package mindswap.academy;

import java.util.Arrays;
import java.util.List;

public class Main {
    static int numberWithMoreOccurency = 0;
    static int maxCount = 0;

    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 3, 3, 4, 3, 4, 2, 2, 2, 7, 7};
        System.out.println(returnTheNumberTheOccurMoreTimeInArray(number));
    }

    public static int returnTheNumberTheOccurMoreTimeInArray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            int count = 0;
            for (int j = 0; j < number.length; j++) {
                if (number[i] == number[j]) count++;
                if (count > maxCount) {
                    numberWithMoreOccurency = number[i];
                    maxCount = count;
                }
            }
        }
        return numberWithMoreOccurency;
    }
}
