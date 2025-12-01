package gyak7CompanyException;

import java.time.LocalDate;

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
    }
}
