package gyak4allatos;

public class Lorry implements MeansOfTransport{
    private int numberOfWheels;
    private double enginePowerInKw;
    private double speedInMeterPerSec;
    private double carryingCapacityInKg;
    private double weight;

    public Lorry(int numberOfWheels, double enginePowerInKw, double speedInMeterPerSec,
                 double carryingCapacityInKg, double weight) {
        this.numberOfWheels = numberOfWheels;
        this.enginePowerInKw = enginePowerInKw;
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public double getEnginePowerInKw() {
        return this.enginePowerInKw;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lorry{");
        sb.append("numberOfWheels=").append(numberOfWheels);
        sb.append(", enginePowerInKw=").append(enginePowerInKw);
        sb.append(", speedInMeterPerSec=").append(speedInMeterPerSec);
        sb.append(", carryingCapacityInKg=").append(carryingCapacityInKg);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
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
}
