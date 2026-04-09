
import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Create ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after insertion
        System.out.println("After Adding Bogies: " + bogies);

        // Remove a bogie
        bogies.remove("AC Chair");

        // Check existence
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final list state
        System.out.println("Final Bogie List: " + bogies);
    }
}
