package gyak3vehicle;

import java.util.Objects;

/**
 * Vehicle osztály, mindenféle járművek tárolására
 */
public class Vehicle {
    /**
     * a motor státuszát tárolja
     */
    private VehicleStatus status;
    /**
     * a jármű kerekeinek a számát tárolja
     */
    private int numberOfWheels;
    /**
     * a jármű azonosítóját tárolja
     */
    private String id;

    /**
     * a Vehicle osztály konstruktora, amegy egy azonosítót vár paraméterként
     * @param id
     */
    public Vehicle(String id){
        this.id = id;
    }

    /**
     * A Vehicle osztály második kontruktora, amely egy azonosítót és egy kerékszámot vár paraméterként
     * @param id
     * @param numberOfWheels
     */

    public Vehicle(String id, int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        this.id = id;
    }

    /**
     * a Vehicle status adattagját átállítja a konstans MOVE értékre
     */

    public void setMove(){
        status = VehicleStatus.MOVE;
    }
    /**
     * a Vehicle status adattagját átállítja a konstans STOP értékre
     */

    public void setStop(){
        status = VehicleStatus.STOP;
    }
    /**
     * a Vehicle status adattagját átállítja a konstans PARK értékre
     */
    public void setPark(){
        status = VehicleStatus.PARK;
    }

    /**
     * status getter
     * @return a Vehicle status adattagját adja vissza
     */
    public VehicleStatus getStatus(){
        return this.status;
    }
    /**
     * numberOfWheels getter
     * @return a Vehicle numberOfWheels adattagját adja vissza
     */
    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

    /**
     * id getter
     * @return a Vehicle id adattagját adja vissza
     */
    public String getId(){
        return this.id;
    }

    /**
     * toString override
     * @return member string
     */

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

    /**
     * equals() override
     * @param o
     * @return igaz, ha a paraméterként megadott objektum megegyezik a Vehicle adott példányával, hamis, ha nem egyezik meg
     *
     */
    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass() != o.getClass()) return false;
        Vehicle oToVehicle = (Vehicle) o;
        //return Objects.equals(this.id, oToVehicle.id);
        if (this.id == oToVehicle.id) return true;
        else return false;
    }

    /**
     * hashCode() override
     * @return a Vehicle id adattagjából számolt hash kóddal
     */
    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }

}
