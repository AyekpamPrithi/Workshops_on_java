import java.util.Scanner;

public class WhileLoop2ndAssg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize the Scanner to take input from the user
        String input;

        // While loop will keep running until user enters 'Yes' or 'No' to quit
        while (true) {
            System.out.println("Enter a command (type 'Yes' or 'No' to quit): ");
            input = scanner.nextLine(); // Read user input

            // Check if the input is "Yes" (case-insensitive)
            if (input.equalsIgnoreCase("Yes")) {
                System.out.println("Exiting the program as you entered 'Yes'.");
                break; // Exit the loop
            }

            // Check if the input is "No" (case-insensitive)
            if (input.equalsIgnoreCase("No")) {
                System.out.println("Exiting the program as you entered 'No'.");
                break; // Exit the loop
            }

            System.out.println("You entered: " + input); // Display the input
        }

        System.out.println("Executed Successfully."); // Final message before termination
        scanner.close(); // Close the scanner resource
    }
}
