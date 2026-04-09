import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    // Helper: Loop-based filtering
    private List<Bogie> loopFilter(List<Bogie> list) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : list) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // Helper: Stream-based filtering
    private List<Bogie> streamFilter(List<Bogie> list) {
        return list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    // Helper: generate large dataset
    private List<Bogie> generateData(int size) {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Bogie("B" + i, i));
        }
        return list;
    }

    // ================= TEST CASES =================

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 50),
                new Bogie("B", 70),
                new Bogie("C", 80)
        );

        List<Bogie> result = loopFilter(list);

        assertEquals(2, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 50),
                new Bogie("B", 70),
                new Bogie("C", 80)
        );

        List<Bogie> result = streamFilter(list);

        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> list = generateData(100);

        List<Bogie> loopResult = loopFilter(list);
        List<Bogie> streamResult = streamFilter(list);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> list = generateData(1000);

        long start = System.nanoTime();

        streamFilter(list);

        long end = System.nanoTime();
        long elapsed = end - start;

        assertTrue(elapsed > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> list = generateData(10000);

        List<Bogie> result = streamFilter(list);

        assertFalse(result.isEmpty());
    }
}