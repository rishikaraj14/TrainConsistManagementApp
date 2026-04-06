import java.util.*;
import java.util.stream.Collectors;

/**
 * MAIN CLASS - TrainConsistManagementApp
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * Demonstrates Stream API filtering based on capacity
 * without modifying the original collection.
 *
 * Author: Rishika Raj
 * Version: 8.0
 */

public class TrainConsistManagementApp {

    // Reusing Bogie model from UC7
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("======================================");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all bogies
        System.out.println("\nALL Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- STREAM FILTER LOGIC ----
        List<Bogie> filteredBogies =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC8 filtering completed ...");
    }
}