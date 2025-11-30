package gyak6SetMap;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        //teszt Room
        Room r1 = new Room(new Building("teszt épület","cim"),
                "klk33");

        r1.addAttribute("attr1");
        r1.addAttribute("attr2");
        r1.addAttribute("attr3");
        r1.delAttribute("attr2");

        System.out.println(r1.getAttributes());

        //HashSet

        HashSet<Building> buildings = new HashSet<>();
        buildings.add(
                new Building("DEIK", "Kassai 26")
        );
        buildings.add(
                new Building("teok", "Kassai 29")
        );
        buildings.add(
                new Building("TEOK", "Kassai 27")
        );
        buildings.add(
                new Building("Foepulet", "Egyetem ter 1")
        );
        buildings.add(
                new Building("DEIK", "Kassai 28")
        );
        buildings.add(
                new Building("teok", "Kassai 29")
        );

        for (Building b : buildings) {
          System.out.println(b);
        }

        for (Building b : buildings) {
            System.out.println(b.hashCode());
        }
        System.out.println();

        //Treeset

        TreeSet<Room> rooms = new TreeSet<>();
        rooms.add(
                new Room(new Building("DEIK", "Kassai 26"),
                        "IK-206")
        );
        rooms.add(
                new Room(new Building("DEIK", "Kassai 26"),
                        "IK-105")
        );
        rooms.add(
                new Room(new Building("TEOK", "Kassai 27"),
                        "2-111")
        );
        rooms.add(
                new Room(new Building("Teok", "Kassai 27"),
                        "1-108")
        );
        rooms.add(
                new Room(new Building("DEIK", "Kassai 26"),
                        "IK-311")
        );
        for (Room r : rooms) {
            System.out.println(r);
        }

        //HashMap

        HashMap<Building, ArrayList<Room>> buildingMap = new HashMap<>();

        for(Room r : rooms){
            ArrayList<Room> al;
            if (buildingMap.containsKey(r.getBuilding())) al = buildingMap.get(r.getBuilding());
            else
                al = new ArrayList<>();
            al.add(r);
            buildingMap.put(r.getBuilding(), al);
        }
        for (Map.Entry<Building, ArrayList<Room>> entry : buildingMap.entrySet()) {
            Building k = entry.getKey();
            ArrayList<Room> val = entry.getValue();

            System.out.println(k);
            System.out.println(val);
        }

    }
}
