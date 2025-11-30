package gyak6SetMap;

import java.util.ArrayList;
import java.util.Comparator;

public class Room implements Comparable<Room> {
    private Building building;
    private String rommId;
    private int numberOfSeats;
    private ArrayList<String> attributes = new ArrayList<>();

    public Room(Building building, String rommId) {
        this.building = building;
        this.rommId = rommId;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Building getBuilding() {
        return this.building;
    }

    public String getRommId() {
        return this.rommId;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public ArrayList<String> getAttributes() {
        return this.attributes;
    }

    public void addAttribute(String attr){
        this.attributes.add(attr);
    }

    public void delAttribute(String attr){
        this.attributes.remove(attr);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Room{");
        sb.append("building=").append(building);
        sb.append(", rommId='").append(rommId).append('\'');
        sb.append(", numberOfSeats=").append(numberOfSeats);
        sb.append(", attributes=").append(attributes);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Room room) {
        int v = this.building.compareTo(room.building);
        if (v != 0) return v;
        return this.rommId.compareTo(room.rommId);
    }
}
