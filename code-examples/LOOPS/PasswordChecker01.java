package LOOPS;

import java.util.Scanner;

public class PasswordChecker01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Correct password
        String correctPassword = "cs2011";

        String inputPassword = "";

        // While loop to prompt for correct password
        while (!inputPassword.equals(correctPassword)) {
            System.out.print("Please enter your password: ");
            inputPassword = scanner.nextLine();
        }

        System.out.print("Access granted. Would you like to play a game?");

    }
}
