package gyak5PackageAnimalRunner;

import gyak5PackageAbstactAnimals.Animal;
import gyak5PackageAbstactAnimals.Pet;
import gyak5PackageAbstactAnimals.PetMammal;
import gyak5PackageAnimals.Cat;
import gyak5PackageAnimals.Dog;
import gyak5PackageAnimals.GilaMonster;
import gyak5PackageAnimals.Snake;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Cat c1 = new Cat("Cirmi");
        System.out.println(c1.getHome());
        Dog d1 = new Dog("Billy");
        System.out.println(d1.getActivityList());

        ArrayList<PetMammal> petMammalArr = new ArrayList<>();
        petMammalArr.add(new GilaMonster("Cuki", "56-b"));
        petMammalArr.add(new Dog("Blöki"));
        petMammalArr.add(new GilaMonster("Káosz", "78-n"));
        petMammalArr.add(new GilaMonster("Berta", "68-m"));
        petMammalArr.add(new Cat("Mirci"));
        petMammalArr.add(new Cat("Foltos"));
        petMammalArr.add(new Dog("Henderson"));

        for(PetMammal p : petMammalArr){
            System.out.println(p);
        }
        System.out.println();


        petMammalArr.sort(new Comparator<PetMammal>() {
            @Override
            public int compare(PetMammal p1, PetMammal p2) {
                int v = p1.getClass().getName().compareTo(p2.getClass().getName());
                if (v != 0) return v;
                return p1.getName().compareTo(p2.getName());
            }
        });


        for(PetMammal p : petMammalArr){
            System.out.println(p);
        }

        Collections.sort(petMammalArr);

        System.out.println();

        for(PetMammal p : petMammalArr){
            System.out.println(p);
        }

        System.out.println();

        ArrayList<Pet> petArr = new ArrayList<>();
        petArr.add(new GilaMonster("Cuki", "56-b"));
        petArr.add(new Dog("Blöki"));
        petArr.add(new GilaMonster("Káosz", "78-n"));
        petArr.add(new GilaMonster("Berta", "68-m"));
        petArr.add(new Cat("Mirci"));
        petArr.add(new Snake(0.5));
        petArr.add(new Cat("Foltos"));
        petArr.add(new Dog("Henderson"));
        petArr.add(new Snake(2));
        petArr.add(new Snake(1));

        for(Animal a : petArr){
            System.out.println(a);
        }
        System.out.println();
        petArr.sort(null);

        for(Animal a : petArr){
            System.out.println(a);
        }

        petArr.sort(new Comparator<Pet>() {
            @Override
            public int compare(Pet p1, Pet p2) {
                int v = p1.getClass().getName().compareTo(p2.getClass().getName());
                if (v != 0) return v;
                if (p1.getName()==null || p2.getName()==null) return 0;
                else return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println();
        for(Animal a : petArr){
            System.out.println(a);
        }
    }
}
