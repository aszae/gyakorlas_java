package gyak4allatos;

public class Frog implements Animal{
    private double speedInMeterPerSec;
    private String sound = "Brekeke";
    private double weight;
    private int numberOfLegs = 4;

    public Frog(double speedInMeterPerSec, double weight) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Frog{");
        sb.append("speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", sound='").append(sound).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", numberOfLegs=").append(numberOfLegs);
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
    public double getWeightInKg() {
        return this.weight;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return this.speedInMeterPerSec;
    }
}
