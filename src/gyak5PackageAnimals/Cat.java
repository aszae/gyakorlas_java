package gyak5PackageAnimals;

import gyak5PackageAbstactAnimals.PetMammal;

import java.util.ArrayList;

public class Cat extends PetMammal {

    public Cat(String name) {
        super(name, 4, "otthonka");
    }

    public String getHome(){
        return super.getHome();
    }
    public void setHome(String home){
        super.setHome(home);
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("nyávog");
        tmp.add("lézert kerget");
        tmp.add("dorombol");
        return tmp;
    }

    @Override
    public String makeSound() {
        return "miau";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(super.getName()).append('\'');
        sb.append(", numberOfLegs=").append(super.getNumberOfLegs());
        sb.append(", home='").append(this.getHome()).append('\'');
        sb.append('}');
        sb.append('}');
        return sb.toString();
    }
}
