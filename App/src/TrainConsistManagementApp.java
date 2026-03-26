import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - TrainConsistManagementApp
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * Entry point of the Train Consist Management Application.
 * Initializes an empty train consist using a dynamic List
 * and displays the initial system state.
 *
 * Author: Rishika Raj
 * Version: 1.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=== Train Consist Management App ===");

        // Create dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initialization message
        System.out.println("Train initialized successfully ...");

        // Display initial consist information
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        // System ready message
        System.out.println("System ready for operations ...");
    }
}