import java.util.LinkedHashSet;
import java.util.Set;

/**
 * MAIN CLASS - TrainConsistManagementApp
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * Demonstrates how LinkedHashSet preserves insertion order
 * while preventing duplicate bogies.
 *
 * Author: Rishika Raj
 * Version: 5.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("======================================");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- Attach bogies ----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // duplicate entry attempt
        formation.add("Sleeper");

        // display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed ...");
    }
}