package gyak1;

import java.nio.DoubleBuffer;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

public class DoubleInputWithStats {
    public static void main(String[] args) {
        double[] doubleArr = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg 10 számot! ");
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = sc.nextDouble();
        }

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > max) max = doubleArr[i];
            if (doubleArr[i] < min) min = doubleArr[i];
            sum += doubleArr[i];
        }

        double streamMax = Arrays.stream(doubleArr).max().getAsDouble();
        double streamMin = Arrays.stream(doubleArr).min().orElse(Double.NaN);
        double streamSum = Arrays.stream(doubleArr).sum();
        double streamAvg = Arrays.stream(doubleArr).average().orElse(0);

        System.out.println("Min: " + streamMin);
        System.out.println("Max: " + streamMax);
        System.out.println("Sum: " + streamSum);
        System.out.println("Mean: " + streamAvg);

        Arrays.sort(doubleArr);
        System.out.println(Arrays.toString(doubleArr));

    }
}
