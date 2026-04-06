import java.util.*;

/**
 * MAIN CLASS - TrainConsistManagementApp
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * Demonstrates validation of domain safety rules
 * using Stream API and allMatch().
 *
 * Author: Rishika Raj
 * Version: 12.0
 */

public class TrainConsistManagementApp {

    // Goods Bogie model
    static class GoodsBogie {

        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("======================================");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // violation

        // Display bogies
        System.out.println("\nGoods Bogies in Train:");

        for (GoodsBogie g : goodsBogies) {
            System.out.println(g.type + " -> " + g.cargo);
        }

        // ---- SAFETY VALIDATION USING allMatch() ----
        boolean isSafe =
                goodsBogies.stream()
                        .allMatch(g ->
                                !g.type.equalsIgnoreCase("Cylindrical")
                                        || g.cargo.equalsIgnoreCase("Petroleum")
                        );

        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed ...");
    }
}