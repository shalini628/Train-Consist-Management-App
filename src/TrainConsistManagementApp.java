import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Create HashSet for bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("B1");
        bogieIDs.add("B2");
        bogieIDs.add("B3");
        bogieIDs.add("B2"); // duplicate
        bogieIDs.add("B1"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}
