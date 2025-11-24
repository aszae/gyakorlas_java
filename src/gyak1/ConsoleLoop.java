package gyak1;

import java.io.Console;

public class ConsoleLoop {
    public static void main(String[] args) {
        Console c = System.console();
        c.printf("Heló! Én egy ismétlő gép vagyok!\n");
        while(true) {
            c.printf("Ismétlendő szöveg: ");
            String myString = c.readLine();
            if (myString.isBlank()) break;
            else c.printf("*bipbup* %1$s *bipbip*\n", myString);
        }
    }
}
