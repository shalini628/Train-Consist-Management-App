import java.util.*;

import java.util.regex.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern tp = Pattern.compile(trainPattern);
        Pattern cp = Pattern.compile(cargoPattern);

        // Match inputs
        Matcher tm = tp.matcher(trainId);
        Matcher cm = cp.matcher(cargoCode);

        // Validate
        if (tm.matches()) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (cm.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

    }
}
