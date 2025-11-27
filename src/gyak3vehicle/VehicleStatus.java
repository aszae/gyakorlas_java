package gyak3vehicle;

public enum VehicleStatus {
    MOVE(1),
    STOP(2),
    PARK(3);

    private final int number;
    VehicleStatus(int number){
        this.number = number;
    };

    public int getNumber(){
        return this.number;
    }
}
