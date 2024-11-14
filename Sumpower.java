public class Sumpower {
    public static void main(String[] args) {
    
        int sumpower = 0;
         
        System.out.println("The number of power of 2:");
        
        // Loop through integers 1 to 10
        for (int i = 1; i <= 10; i++) {
            int square = i * i;  // Calculate the square of the current integer
            System.out.println("The square of " + i + " is: " + square);
            sumpower += square;  // Add the square to the sum
        }
        
        // Display the total sum of squares
        System.out.println("The sum of squares from 1 to 10 is: " + sumpower);
    }
}

    
        

