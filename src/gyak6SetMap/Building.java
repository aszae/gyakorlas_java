package gyak6SetMap;

import java.util.Objects;

public class Building {
    private String name;
    private String address;

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Building{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(name.toLowerCase(), building.name.toLowerCase());
    }

    public int compareTo(Building building) {
        return this.name.toLowerCase().compareTo(building.name.toLowerCase());
    }
}
