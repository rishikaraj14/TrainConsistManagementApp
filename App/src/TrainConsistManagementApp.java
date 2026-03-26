import java.util.LinkedList;
import java.util.List;

/**
 * MAIN CLASS - TrainConsistManagementApp
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * Demonstrates how LinkedList maintains physical
 * order of train bogies and supports fast insertion
 * and deletion operations.
 *
 * Author: Rishika Raj
 * Version: 4.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("======================================");

        // Create LinkedList for ordered bogie structure
        List<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies in sequence ----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // ---- INSERT bogie at specific position ----
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // ---- REMOVE first and last bogie ----
        trainConsist.remove(0); // remove Engine
        trainConsist.remove(trainConsist.size() - 1); // remove Guard

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed ...");
    }
}