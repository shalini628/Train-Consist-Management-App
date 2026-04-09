import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.*;

public class TrainConsistManagementAppTest {

    // Helper methods (same logic as your main)
    private boolean isValidTrainId(String trainId) {
        Pattern tp = Pattern.compile("TRN-\\d{4}");
        Matcher tm = tp.matcher(trainId);
        return tm.matches();
    }

    private boolean isValidCargoCode(String cargoCode) {
        Pattern cp = Pattern.compile("PET-[A-Z]{2}");
        Matcher cm = cp.matcher(cargoCode);
        return cm.matches();
    }

    // ================= TEST CASES =================

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(isValidTrainId("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(isValidTrainId("TRAIN12"));
        assertFalse(isValidTrainId("TRN12A"));
        assertFalse(isValidTrainId("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(isValidCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(isValidCargoCode("PET-ab")); // lowercase
        assertFalse(isValidCargoCode("PET123"));
        assertFalse(isValidCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(isValidTrainId("TRN-123"));
        assertFalse(isValidTrainId("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(isValidCargoCode("PET-ab"));
        assertFalse(isValidCargoCode("PET-Ac"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(isValidTrainId(""));
        assertFalse(isValidCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(isValidTrainId("TRN-1234XYZ"));
        assertFalse(isValidCargoCode("PET-AB12"));
    }

}