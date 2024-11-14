 class Sequencenumber {
    
    public static void main(String[] args) {
        // Start from 99 and decrement by 11 each time until 11
        for (int i = 99; i >= 11; i -= 11) {
            System.out.print(i + " ");
        }
    }
}

        
 import javax.swing.*;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        StringBuilder result = new StringBuilder();

        // Input 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(input);
        }

        // Classify each number as odd or even
        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0) {
                result.append(numbers[i]).append(" is Even\n");
            } else {
                result.append(numbers[i]).append(" is Odd\n");
            }
        }

        // Display the results in a JOptionPane text box
        JOptionPane.showMessageDialog(null, result.toString(), "Odd or Even", JOptionPane.INFORMATION_MESSAGE);

        scanner.close();
    }
}
