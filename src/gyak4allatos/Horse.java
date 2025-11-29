package gyak4allatos;

import java.time.LocalDate;

public class Horse implements Animal, MeansOfTransport, Comparable<Horse>{
    private double speedInMeterPerSec;
    private double carryingCapacityInKg;
    private String sound = "Nyihaha";
    private double weight;
    private int numberOfLegs = 4;

    private String name;
    private String color;
    private LocalDate birthDate;

    public Horse(double speedInMeterPerSec, double carryingCapacityInKg,
                 double weight, String name, String color, LocalDate birthDate) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Horse{");
        sb.append("speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", carryingCapacityInKg=").append(carryingCapacityInKg);
        sb.append(", Sound='").append(sound).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", numberOfLegs=").append(numberOfLegs);
        sb.append(", name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getSound() {
        return this.sound;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public double getCarryingCapacityInKg() {
        return this.carryingCapacityInKg;
    }

    @Override
    public double getWeightInKg() {
        return this.weight;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return this.speedInMeterPerSec;
    }

    /*@Override
    public int compareTo(Horse o){
        if (this.color.length() > o.color.length()) return 1;
        if (this.color.length() < o.color.length()) return -1;
        return 0;
    }*/

    @Override
    public int compareTo(Horse o){
        int v = this.getColor().compareTo(o.getColor());
        if(v != 0) return v;
        return this.getName().compareTo(o.getName());
    }
}
