package purchasingsystem;

import java.util.Scanner;

public class Purchasingsystems {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object for input
        int menu;

        // Display the menu options
        System.out.println("1 = roti bun");
        System.out.println("2 = biskut lexus");
        System.out.println("3 = apollo");
        System.out.println("4 = nabati");
        System.out.println("5 = m&n");

        // Prompt the user to enter their menu choice
        System.out.print("Enter your menu: ");
        menu = input.nextInt();  // Read the user's menu choice

        int quantity;  // Variable to store the quantity of items
        int price = 0;  // Variable to store the price of the selected item, initialized to 0
        int totalprice;  // Variable to store the total price

        // Determine the price based on the user's menu choice
        switch (menu) {
            case 1:
                System.out.println("roti bun");
                System.out.println("Price: RM 4");
                price = 4;  // Set the price for roti bun
                break;  // Exit the switch statement
            case 2:
                System.out.println("biskut lexus");
                System.out.println("Price: RM 3");
                price = 3;  // Set the price for biskut lexus
                break;  // Exit the switch statement
            case 3:
                System.out.println("apollo");
                System.out.println("Price: RM 5");
                price = 5;  // Set the price for apollo
                break;  // Exit the switch statement
            case 4:
                System.out.println("nabati");
                System.out.println("Price: RM 3");
                price = 3;  // Set the price for nabati
                break;  // Exit the switch statement
            case 5:
                System.out.println("m&n");
                System.out.println("Price: RM 3");
                price = 3;  // Set the price for m&n
                break;  // Exit the switch statement
            default:
                // Handle invalid menu selection
                System.out.println("Invalid menu selection.");
                
        }

        // Prompt the user to enter the quantity of items
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();  // Read the quantity

        // Calculate the total price
        totalprice = quantity * price;

        // Display the total price
        System.out.println("Total price: RM " + totalprice);
    
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
