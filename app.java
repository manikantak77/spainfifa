import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // 1. Basic Output
        System.out.println("Welcome to Java Programming!");
        
        // 2. Reading Input and Using Variables
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        // 3. Simple Calculation
        int currentYear = 2026;
        int age = currentYear - birthYear;
        
        System.out.println("\nHello, " + name + "! You are approximately " + age + " years old.");
        
        // 4. Conditional Logic (If-Else)
        if (age >= 18) {
            System.out.println("Status: You are an adult.");
        } else {
            System.out.println("Status: You are a minor.");
        }
        
        // 5. Loop Demonstration (Counting to 3)
        System.out.println("\nLet's count to 3:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Number: " + i);
        }
        
        // Close the scanner to release resources
        scanner.close();
        System.out.println("\nProgram finished successfully.");
    }
}
