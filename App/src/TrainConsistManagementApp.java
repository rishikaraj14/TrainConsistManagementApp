import java.util.HashSet;
import java.util.Set;

/**
 * MAIN CLASS - TrainConsistManagementApp
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * Demonstrates how HashSet ensures uniqueness
 * by preventing duplicate bogie IDs.
 *
 * Author: Rishika Raj
 * Version: 3.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("======================================");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // duplicate entries
        bogies.add("BG101");
        bogies.add("BG102");

        // display result
        System.out.println("\nBogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed ...");
    }
}