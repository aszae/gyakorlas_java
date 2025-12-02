package gyak7CompanyException;

import gyak1.ConsoleGyak;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //elkapás

        Employee emp = null;
        try {
            emp = new Employee(10,"Gipsz Jakab", LocalDate.of(1954,3,6));
            System.out.println(emp);
        } catch (WrongBirthDateException e){
            System.out.println("O-ó!");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hehe mindig lefutok");
        }

        EmployeeWithSizes emp2 = null;

        try {
            emp2 = new EmployeeWithSizes(20, "Jaki",
                    LocalDate.of(2000, 5, 6));
            emp2.setShoeSize(80);
            emp2.setHeightInCm(195);
        } catch (WrongBirthDateException | HeightException | ShoeSizeException e) {
            System.out.println(e.getMessage());
        }

        EmployeeWithSizes emp3 = null;

        try {
            emp3 = new EmployeeWithSizes(20, "Jaki",
                    LocalDate.of(2000, 5, 6));
            emp3.setShoeSize(80);
            emp3.setHeightInCm(195);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        //Kiírás
        ArrayList<Company> companyList = new ArrayList<>();
        companyList.add(new Company("DEIK", "HA"));
        companyList.add(new Company("Tesla", "EM"));
        companyList.add(new Company("Meta", "MZ"));
        companyList.add(new Company("DE", "KGY"));

        File file = new File("halo/companyList.txt");

        try(Formatter fm = new Formatter(file)){
            for (Company c : companyList){
                fm.format("%1$s, %2$s\n", c.getName(),c.getNameOfLeader());
            }
        }catch (FileNotFoundException e){
            System.out.println("File hiba!");;
        }

        //Olvasás

        ArrayList<Company> companies = new ArrayList<>();

        try(Scanner reader = new Scanner(new File("companyList.txt"))){
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(", ");
                companies.add(new Company(parts[0], parts[1]));
            }
        } catch (FileNotFoundException e){
            System.out.println("File hiba!");
        }
        System.out.println(companies);

        //kiírás v2
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Jakab",
                LocalDate.of(2000, 4, 5)));
        personList.add(new Employee(10, "Johnny",
                LocalDate.of(2000, 8, 9)));
        EmployeeWithSizes empWS = new EmployeeWithSizes(20, "Tiki",
                LocalDate.of(1999, 7, 6));
        empWS.setShoeSize(45);
        empWS.setHeightInCm(185);
        personList.add(empWS);

        System.out.println(personList);
        try (Formatter writer = new Formatter(new File("personList.txt"))){
            for (Person p : personList){
                writer.format("%s\n", p );
            }
        }catch (FileNotFoundException e){
            System.out.println("File hiba!");
        }

    }
}
