import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create list of goods bogies
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Box", "Coal"));
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Safety validation using allMatch()
        boolean isSafe = list.stream()
                .allMatch(b ->
                        !(b.type.equals("Cylindrical")) ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFE");
        } else {
            System.out.println("Train is NOT SAFE");
        }

    }
}
