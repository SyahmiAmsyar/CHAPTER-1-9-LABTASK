import java.util.Scanner;

public class Passwordsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "Ntahlah123";  // Set the correct password
        int maxAttempts = 3;  // Maximum number of attempts allowed

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Enter your password: ");
            String inputPassword = input.nextLine();  // Read user input

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Access granted. Welcome!");
                input.close();
                return;  // Exit the program after successful login
            } else {
                System.out.println("Incorrect password. Attempts left: " + (maxAttempts - attempts));
            }
        }

        System.out.println("Maximum attempts reached. Access denied.");
        input.close();  // Close the scanner
    }
}