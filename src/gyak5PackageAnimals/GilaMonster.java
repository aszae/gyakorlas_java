package gyak5PackageAnimals;

import gyak5PackageAbstactAnimals.PetMammal;
import gyak5PackageAbstactAnimals.ProtectedAnimal;

import java.util.ArrayList;

public class GilaMonster extends PetMammal implements ProtectedAnimal {
    private String lawNumber;

    public GilaMonster(String name, String lawNumber) {
        super(name, 4, "homehome");
        this.lawNumber = lawNumber;
    }

    @Override
    public String getLawNumber() {
        return this.lawNumber;
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> tmp = new ArrayList<String>();
        tmp.add("napozik");
        tmp.add("legyet fog");
        tmp.add("álcázza magát");
        return tmp;
    }

    @Override
    public String makeSound() {
        return "sssssssssszzzzzzzz";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GilaMonster{");
        sb.append("name='").append(super.getName()).append('\'');
        sb.append(", numberOfLegs=").append(super.getNumberOfLegs());
        sb.append(", home='").append(super.getHome()).append('\'');
        sb.append(", lawNumber='").append(lawNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
