package gyak5PackageAbstactAnimals;

import java.util.ArrayList;

public abstract class PetMammal implements Pet, Vertebrates{
    private String name;
    private int numberOfLegs;
    private String home;

    protected PetMammal(String name, int numberOfLegs, String home) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.home = home;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public String getName() {
        return this.name;
    }

    protected String getHome() {
        return this.home;
    }

    protected void setHome(String home) {
        this.home = home;
    }

    public abstract ArrayList<String> getActivityList();

    @Override
    public int compareTo(Vertebrates o) {
        int v = this.getNumberOfLegs() - o.getNumberOfLegs();
        if (v != 0) return v;
        if (!(o instanceof PetMammal)) return 0;
        PetMammal o2 = (PetMammal) o;
        return this.getName().compareTo(o2.getName());
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PetMammal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", numberOfLegs=").append(numberOfLegs);
        sb.append(", home='").append(home).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
