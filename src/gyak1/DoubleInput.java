package gyak1;

import java.io.Console;
import java.io.Reader;

public class DoubleInput {
    public static void main(String[] args) {
        Console c = System.console();
        double[] doubleArr = new double[10];

        for (int i = 0; i < doubleArr.length ; i++) {
            c.printf("Adjon meg egy számot (double)! ");
            doubleArr[i]= Double.parseDouble(c.readLine());
        }

        c.printf("A számok: ");
        for (double d: doubleArr) {
            c.printf("%1$s ", d);
        }

        c.printf("\n");

    }
}
