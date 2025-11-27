package gyak3vehicle;

public class Bicycle extends Vehicle {
    private int size;

    public Bicycle(String registrationNumber){
        super(registrationNumber);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicycle{");
        sb.append("size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
