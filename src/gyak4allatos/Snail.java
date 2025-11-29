package gyak4allatos;

public class Snail implements Animal{
    private double speedInMeterPerSec;
    private String sound = "";
    private double weight;
    private int numberOfLegs = 0;
    private String snailType;

    public Snail(double speedInMeterPerSec, String snailType, double weight) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.snailType = snailType;
        this.weight = weight;
    }

    public String getSnailType() {
        return this.snailType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Snail{");
        sb.append("speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", sound='").append(sound).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", numberOfLegs=").append(numberOfLegs);
        sb.append(", snailType='").append(snailType).append('\'');
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
