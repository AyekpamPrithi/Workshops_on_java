// Do some practical question of break and comtinue with for and while loop
//TASK5 assignment (22/10/24)


public class LoopBreakandContdTASK5 {
    public static void main(String[] args) {
        
        // Example of 'break' in a 'for' loop
        System.out.println("For loop with break (stops at 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; // Exit the loop when i equals 6
            }
            System.out.println("i = " + i); // Print i
        }
        
        // Example of 'continue' in a 'for' loop
        System.out.println("\nFor loop with continue (skips even numbers):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip this iteration for even numbers
            }
            System.out.println("i = " + i); // Only odd numbers will be printed
        }

        // Example of 'continue' in a 'while' loop
        System.out.println("\nWhile loop with continue (skips even numbers):");
        int i = 0;
        while (i < 10) {
            i++; // Increment i
            if (i % 2 == 0) {
                continue; // Skip this iteration for even numbers
            }
            System.out.println("i = " + i); // Only odd numbers will be printed
        }
    }
}
