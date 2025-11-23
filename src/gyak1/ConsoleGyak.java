package gyak1;
import java.io.Console;


public class ConsoleGyak {
    public static void main(String[] args) {
        System.out.println("Helóka!");
        Console c = System.console();
        String input = c.readLine("Na? Mi legyen a válasz?\n");
        System.out.println(input);
        System.out.println(c.toString());
        System.out.println(c);
        c.printf("Helóka! %1$s\n", input);
        c.format("Helóka! %1$s\n", input);
        c.flush();

    }
}
