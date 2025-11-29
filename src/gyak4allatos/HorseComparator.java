package gyak4allatos;

import java.util.Comparator;

public class HorseComparator implements Comparator<Horse>{
    @Override
    public int compare(Horse o1, Horse o2) {
        int v = (int) (o1.getCarryingCapacityInKg()- o2.getCarryingCapacityInKg());
        if (v !=0 ) return v;
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
