package gyak1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        String[] stringArr = new String[5];
        Scanner reader = new Scanner(System.in);
        System.out.println("Adjon meg egy szót, vagy mondatot!");
        Arrays.fill(stringArr, "0");
        int i = 0;
        while (i < stringArr.length && reader.hasNext()){
            System.out.println("Adjon meg egy szót, vagy mondatot!");
            stringArr[i] = reader.nextLine();
            i++;
        }


        String s = stringArr[0];
        i = 0;
        while (!s.equals("0") && i < stringArr.length){
            System.out.println("Eredeti: " + stringArr[i]);
            System.out.println("Kisbetűs: " + stringArr[i].toLowerCase());
            System.out.println("Nagybetűs: " + stringArr[i].toUpperCase());
            System.out.println("Van-e szóköz: " + stringArr[i].contains(" "));
            System.out.println("Üres-e (üres vagy csak whitespace karaktereket tartamaz): " + stringArr[i].isBlank());
            System.out.println("Üres-e (0 a string hossza):" + stringArr[i].isEmpty());
            if (i == stringArr.length-1) s = stringArr[i];
            else s = stringArr[i+1];
            i++;
        }

    }
}
