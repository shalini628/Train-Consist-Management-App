import java.util.*;
import java.util.stream.Collectors;

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

        // Create bogie list
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(new Bogie("B" + i, i));
        }

        // -------- LOOP BASED --------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : list) {
            if (b.capacity > 5000) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------- STREAM BASED --------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = list.stream()
                .filter(b -> b.capacity > 5000)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Output
        System.out.println("Loop Execution Time: " + loopTime + " ns");
        System.out.println("Stream Execution Time: " + streamTime + " ns");
    }
    }

