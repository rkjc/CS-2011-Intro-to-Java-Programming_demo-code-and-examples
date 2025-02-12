package ScannerSystemOutIO;
 
import java.util.Scanner;

public class SimpleIO {
    public static void main(String[] args) {
        System.out.println("---------- starting program -------------");

        int myvariable = 6787;

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("your name is ");
        System.out.println(name);

        System.out.print("Enter your age: ");
       int age = scanner.nextInt();

        // Close the scanner
        scanner.close();

        System.out.println("---------- ended program -------------");
    }
}



