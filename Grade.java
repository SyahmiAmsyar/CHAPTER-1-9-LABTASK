import java.util.Scanner;

public class Grade { 
    public static void main(String[] args) {
        int grade;
    
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their grade
        System.out.println("Enter your grade:");
        grade = input.nextInt();
        
        // Determine the grade and print the corresponding letter grade
        if (grade >= 85) {
            System.out.println("A");
        } else if (grade >= 75) {
            System.out.println("B");
        } else if (grade >= 65) {
            System.out.println("C");
        } else if (grade >= 55) {
            System.out.println("D");
        } else { 
            System.out.println("E");
        }   
        
        // Close the scanner
        input.close();
    }
}
     
     
     
        
