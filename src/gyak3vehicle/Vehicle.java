package gyak3vehicle;

import java.util.Objects;

public class Vehicle {
    private VehicleStatus status;
    private int numberOfWheels;
    private String id;

    public Vehicle(String id){
        this.id = id;
    }

    public Vehicle(String id, int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        this.id = id;
    }

    public void setMove(){
        status = VehicleStatus.MOVE;
    }

    public void setStop(){
        status = VehicleStatus.STOP;
    }
    public void setPark(){
        status = VehicleStatus.PARK;
    }
    public VehicleStatus getStatus(){
        return this.status;
    }
    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle = [status = ");
        sb.append(this.status);
        sb.append(", numberOfWheels = ");
        sb.append(this.numberOfWheels);
        sb.append(", id = ");
        sb.append(this.id);
        sb.append("]");
        return sb.toString();
    }
    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass() != o.getClass()) return false;
        Vehicle oToVehicle = (Vehicle) o;
        //return Objects.equals(this.id, oToVehicle.id);
        if (this.id == oToVehicle.id) return true;
        else return false;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }

}
