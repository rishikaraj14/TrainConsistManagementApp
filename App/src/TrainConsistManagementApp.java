import java.util.*;
import java.util.stream.*;

/**
 * MAIN CLASS - TrainConsistManagementApp
 *
 * Use Case 10: Count Total Seats in Train (reduce)
 *
 * Description:
 * Demonstrates aggregation of seating capacity
 * using Stream map() and reduce().
 *
 * Author: Rishika Raj
 * Version: 10.0
 */

public class TrainConsistManagementApp {

    // Reusing Bogie model
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
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("======================================");

        // Create List of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- AGGREGATE USING REDUCE ----
        int totalSeats =
                bogies.stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        System.out.println("\nUC10 aggregation completed ...");
    }
}