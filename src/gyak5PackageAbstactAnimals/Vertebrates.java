package gyak5PackageAbstactAnimals;

public interface Vertebrates extends Animal, Comparable<Vertebrates>{
    @Override
    int compareTo(Vertebrates o);
    int getNumberOfLegs();
}
