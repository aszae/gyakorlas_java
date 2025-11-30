package gyak5PackageAnimals;

import gyak5PackageAbstactAnimals.PetMammal;

import java.util.ArrayList;

public class Dog extends PetMammal {
    public Dog(String name) {
        super(name, 4, "otthonka");
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("frizbit fog");
        tmp.add("labdát kerget");
        tmp.add("ugat");
        return tmp;
    }

    @Override
    public String makeSound() {
        return "woof";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("name='").append(super.getName()).append('\'');
        sb.append(", numberOfLegs=").append(super.getNumberOfLegs());
        sb.append(", home='").append(super.getHome()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
