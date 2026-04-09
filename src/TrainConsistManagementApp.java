
import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}



public class TrainConsistManagementApp {
    public static void main(String[] args) {
// Create list of bogies
        List<Bogie> list = new ArrayList<>();

        // Add bogies
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 40));

        // Sort by capacity (ascending)
        list.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        for (Bogie b : list) {
            System.out.println(b.name + " -> " + b.capacity);
        }

    }
}
