import java.util.Scanner;

public class InputExp {


   public static void main (String[] args) {

       String name;
       int age;
       Scanner input = new Scanner(System.in);
       
       // Reads a single line from the console
       // and stores into name variable
       name = input.nextLine();
       
       // Reads a integer from the console
       // and stores into age variable
       age=input.nextInt();
       input.close();
       
       // Prints name and age to the console
       System.out.println("Name :"+name);
       System.out.println("Age :"+age);
               
       
}
}
