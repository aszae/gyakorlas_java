package gyak3vehicle;

public class Car extends Vehicle{
    private boolean engineWorking;
    private int horsePower;

    public Car(String licensePlate, int horsePower){
        super(licensePlate, 4);
        this.horsePower = horsePower;
        this.setEngineToStop();
    }

    public Car(String licensePlate){
        super(licensePlate);
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isEngineWorking(){
        return engineWorking;
    }

    public void setEngineToWork(){
        engineWorking = true;
    }

    public void setEngineToStop(){
        engineWorking = false;
    }


    @Override
    public void setMove() {
        super.setMove();
        this.setEngineToWork();
    }

    @Override
    public void setPark() {
        super.setPark();
        this.setEngineToStop();
    }

    @Override
    public void setStop() {
        super.setStop();
        this.setEngineToWork();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("engineWorking=").append(engineWorking);
        sb.append(", horsePower=").append(horsePower);
        sb.append('}');
        return sb.toString();
    }
}
