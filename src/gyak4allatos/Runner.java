package gyak4allatos;

import java.time.LocalDate;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Snail[] snailArr = new Snail[3];
        snailArr[0] = new Snail(1, "csupasz",
                2);
        snailArr[1] = new Snail(0.5, "hazas",
                0.7);
        snailArr[2] = new Snail(0.7, "exotikus",
                2);

        for(Snail s : snailArr){
            System.out.println(s);
        }

        System.out.println();

        Arrays.sort(snailArr, new Comparator<Snail>() {
            @Override
            public int compare(Snail s1, Snail s2) {
                return Double.compare(s1.getSpeedInMeterPerSec(),s2.getSpeedInMeterPerSec());
            }
        });

        for (Snail s: snailArr){
            System.out.println(s);
        }

        ArrayList<Horse> horseArr = new ArrayList<Horse>();
        horseArr.add(new Horse(2, 200, 300,
                "Puku", "fekete", LocalDate.of(2010, 5, 15)
        ));
        horseArr.add(new Horse(4, 100,
                300, "Bubu", "feher",
                LocalDate.of(2020, 5, 15)
        ));
        horseArr.add(new Horse(3, 200,
                300, "Piki", "barna",
                LocalDate.of(2015, 5, 15)
        ));
        horseArr.add(new Horse(2, 200,
                300, "Lulu", "fekete",
                LocalDate.of(2012, 5, 15)
        ));

        System.out.println();

        for (Horse h: horseArr){
            System.out.println(h);
        }

        horseArr.sort(new Comparator<Horse>() {
            @Override
            public int compare(Horse h1, Horse h2) {
                return Double.compare(h1.getSpeedInMeterPerSec(), h2.getSpeedInMeterPerSec());
            }
        });

        System.out.println();

        for (Horse h: horseArr){
            System.out.println(h);
        }

        horseArr.sort(new HorseComparator());

        System.out.println();

        for (Horse h: horseArr){
            System.out.println(h);
        }

        System.out.println();

        Collections.sort(horseArr);

        for (Horse h: horseArr){
            System.out.println(h);
        }
    }
}
