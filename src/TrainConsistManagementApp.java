
import java.util.HashMap;
import java.util.Map;


public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create HashMap for bogie-capacity
        HashMap<String, Integer> capacityMap = new HashMap<>();

        // Insert bogies with capacity
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

    }
}
