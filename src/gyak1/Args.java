package gyak1;

import java.io.Console;

public class Args {
    public static void main(String[] args) {
        if (args.length!=0) System.console().printf("A parancssori argumentumok: %1$s", args[0]);
        for (int i = 1; i < args.length; i++) {
            System.console().printf(", %1$s", args[i]);
        }
    }
}
