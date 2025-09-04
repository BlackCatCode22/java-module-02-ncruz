import java.util.Scanner;  // Import Scanner to get user input

public class reversestrings {  // Class name must match the file name (ReversedStrings.java)

    public static void main(String[] args) {  // Main method: where the program starts

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();  // Read the full line of input

        // Reverse the string using a StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the scanner
        scanner.close();
    }
}