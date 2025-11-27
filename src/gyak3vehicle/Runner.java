package gyak3vehicle;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("234",6);
        System.out.println(v1);
        System.out.println(v1.toString());

        Car c1 = new Car("456-tzu", 1000);
        System.out.println(c1);
        c1.setEngineToWork();
        System.out.println(c1);
        c1.setPark();
        System.out.println(c1);

        Car c2 = new Car("3",2);
        Vehicle v2 = (Vehicle) c2;
        System.out.println(v2);
        System.out.println(v2.getClass());
        System.out.println(v2.getClass().getName());
        System.out.println(Arrays.toString(v2.getClass().getConstructors()));

        Bicycle b1 = new Bicycle("33");
        System.out.println(b1);

       VehicleStatus park = VehicleStatus.PARK;
        System.out.println(park.getNumber());
    }
}
