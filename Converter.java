import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double conversionRate;
        double result;
        
        System.out.println("Converter available:");
        System.out.println("1. Currency (RM - YEN)");
        System.out.println("2. Mass (kg - pound)");
        System.out.println("3. Distance (km - meter)");
        
        System.out.print("Choose your converter (1-3): ");
        int choice = scanner.nextInt();
        
        System.out.print("Insert Amount/Quantity: ");
        double amount = scanner.nextDouble();
        
        switch (choice) {
            case 1:
                // Currency conversion: MYR to YEN
                conversionRate = 32.3588; // 1 MYR = 32.3588 YEN
                result = amount * conversionRate;
                System.out.println("RM " + amount + " = " + result + " JPY");
                break;
                
            case 2:
                // Mass conversion: kg to pound
                conversionRate = 2.20462; // 1 kg = 2.20462 pounds
                result = amount * conversionRate;
                System.out.println(amount + " kg = " + result + " pounds");
                break;
                
            case 3:
                // Distance conversion: km to meter
                conversionRate = 1000; // 1 km = 1000 meters
                result = amount * conversionRate;
                System.out.println(amount + " km = " + result + " meters");
                break;
                
            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        scanner.close();
    }
}
