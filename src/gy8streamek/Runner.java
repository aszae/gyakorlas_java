package gy8streamek;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Konyv> konyvek = new ArrayList<>();
        try(Scanner reader = new Scanner(new File("konyv.txt"))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(";");
                try {
                    konyvek.add(new Konyv(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3],
                            LocalDate.parse(parts[4], DateTimeFormatter.ofPattern("yyyy.MM.dd")), Integer.parseInt(parts[5]), parts[6], Integer.parseInt(parts[7])));

                } catch (ArrayIndexOutOfBoundsException e) {
                    try {
                        konyvek.add(new Konyv(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3],
                                LocalDate.parse(parts[4], DateTimeFormatter.ofPattern("yyyy.MM.dd")), Integer.parseInt(parts[5]), parts[6], null));

                    }catch (ArrayIndexOutOfBoundsException e2){
                        konyvek.add(new Konyv(Integer.parseInt(parts[0]), parts[1], parts[2], null,
                                null, null, null, null));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File hiba!");
        }
        //összes könyv kiírás

        konyvek.stream().forEach(e -> System.out.println(e));
        konyvek.forEach(System.out::println);
        System.out.println();
        //olyan könyvek amik címében szerepel az "i" betű
        konyvek.stream().filter(e -> e.getCim().contains("i")).forEach(e -> System.out.println(e));

        //ahol van ár annak írjuk ki az átlagát

        System.out.println();
        System.out.println(konyvek.stream().filter(e -> e.getAr() != null).mapToInt(e -> e.getAr()).average().orElse(Double.NaN));

        //írjuk ki a könyvek darabszámát
        System.out.println(konyvek.stream().count());

        //írjuk ki a legnagyobb árral rendelkező könyvet

        System.out.println(
                konyvek.stream().max(new Comparator<Konyv>() {
                    @Override
                    public int compare(Konyv k, Konyv k1) {
                        int ar1 = k.getAr() == null ? 0 : k.getAr();
                        int ar2 = k1.getAr() == null ? 0 : k1.getAr();
                        return ar1-ar2;
                    }
                }).get()
        );

        // irjuk ki az oszses kony cimet egy sorba "; "-el elvalasztva

        System.out.println(konyvek.stream().map(Konyv::getCim).reduce((a, b)-> a + "; " +b).get());

        // irjuk ki azon konyveket amelyek mufaja nem null
        // es vagy sci-fi vagy krimi vagy horror
        System.out.println(konyvek.stream().filter(e -> e.getMufaj() !=null && (e.getMufaj().equals("sci-fi") ||
                e.getMufaj().equals("krimi") || e.getMufaj().equals("horror"))).collect(Collectors.toList()));

        // ugyanez a filter csak kiadonkent gyujtsuk a konyveket
        System.out.println(konyvek.stream().filter(e -> e.getMufaj() !=null && (e.getMufaj().equals("sci-fi") ||
                e.getMufaj().equals("krimi") || e.getMufaj().equals("horror"))).collect(Collectors.groupingBy(e -> e.getKiado())));

        Map<String, List<Konyv>> km = konyvek.stream().filter(e -> e.getMufaj() !=null && (e.getMufaj().equals("sci-fi") ||
                e.getMufaj().equals("krimi") || e.getMufaj().equals("horror"))).collect(Collectors.groupingBy(e -> e.getKiado()));

        for (Map.Entry<String, List<Konyv>> entry : km.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }

        // ugyanaz a filter de most kiadonkenti atlagarat szeretnenk

        System.out.println(konyvek.stream().filter(e -> e.getMufaj() !=null && (e.getMufaj().equals("sci-fi") ||
                e.getMufaj().equals("krimi") || e.getMufaj().equals("horror"))).collect(Collectors.groupingBy((e -> e.getKiado()), Collectors.averagingInt(e -> e.getAr()))));

        // ugyanaz a filter es csoportositas de a minimum aru konyv kell
        System.out.println(konyvek.stream().filter(e -> e.getMufaj() !=null && (e.getMufaj().equals("sci-fi") ||
                e.getMufaj().equals("krimi") || e.getMufaj().equals("horror"))).collect(Collectors.groupingBy((e -> e.getKiado()), Collectors.minBy((o, o2)-> o.getAr()-o2.getAr()))));

        // ugyanez a filter es csop de most mufaj kell egybefuzve
        System.out.println(konyvek.stream().filter(e -> e.getMufaj() !=null && (e.getMufaj().equals("sci-fi") ||
                e.getMufaj().equals("krimi") || e.getMufaj().equals("horror"))).collect(
                        Collectors.groupingBy((e -> e.getKiado()), Collectors.reducing(" ", Konyv::getMufaj, String::concat))));
    }
}
