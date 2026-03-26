import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - TrainConsistManagementApp
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * Demonstrates CRUD operations using ArrayList
 * to dynamically manage passenger bogies.
 *
 * Author: Rishika Raj
 * Version: 2.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("======================================");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- DELETE (Remove bogie) ----
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- READ (Check existence) ----
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("Contains Sleeper? : " + exists);

        // Final state
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully ...");
    }
}