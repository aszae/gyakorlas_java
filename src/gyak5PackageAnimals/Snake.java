package gyak5PackageAnimals;

import gyak5PackageAbstactAnimals.Animal;
import gyak5PackageAbstactAnimals.Pet;
import gyak5PackageAbstactAnimals.PetMammal;

public class Snake implements Pet, Comparable<Pet>{
    private double speedInMeterPerSec;
    private String name;

    public Snake(double speedInMeterPerSec) {
        this.speedInMeterPerSec = speedInMeterPerSec;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String makeSound() {
        return "sszz";
    }

    public double getSpeedInMeterPerSec() {
        return this.speedInMeterPerSec;
    }

    @Override
    public int compareTo(Pet o) {
        if ( !(o instanceof Snake)) return 0;
        Snake o2 = (Snake) o;
        int v = (int) (this.getSpeedInMeterPerSec() -  o2.getSpeedInMeterPerSec());
        if (v!=0) return v;
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Snake{");
        sb.append("speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
