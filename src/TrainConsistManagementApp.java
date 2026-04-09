import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry Car at position 2 (index starts from 0)
        train.add(2, "Pantry Car");

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Display final train consist
        System.out.println("Final Train Consist: " + train);

    }
}
