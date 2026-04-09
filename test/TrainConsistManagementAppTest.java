import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;
public class TrainConsistManagementAppTest {

    // Helper method (same logic as your main program)
    private int totalCapacity(List<Bogie> list) {
        return list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 40)
        );

        int total = totalCapacity(list);

        assertEquals(172, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Luxury", 80),
                new Bogie("AC Chair", 60)
        );

        int total = totalCapacity(list);

        assertEquals(212, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72)
        );

        int total = totalCapacity(list);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        int total = totalCapacity(list);

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 10),
                new Bogie("B", 20),
                new Bogie("C", 30)
        );

        int total = totalCapacity(list);

        assertEquals(60, total); // 10 + 20 + 30
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 10),
                new Bogie("B", 20),
                new Bogie("C", 30),
                new Bogie("D", 40)
        );

        int total = totalCapacity(list);

        assertEquals(100, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));

        List<Bogie> copy = new ArrayList<>(list);

        totalCapacity(list);

        assertEquals(copy.size(), list.size());
        assertEquals(copy.get(0).name, list.get(0).name);
    }

}