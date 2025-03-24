package LOOPS;

import java.util.Scanner;

public class PasswordChecker02 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Correct password
        String correctPassword = "cs2011";

        String inputPassword = "";

        int count = 0;
        // While loop to prompt for correct password
        while (!inputPassword.equals(correctPassword) && count < 5) {
            if (count > 3){
                System.out.print("Suspicious activity detected, please contact system admin.");
                break;
            } else {
                System.out.print("User name and/or password not found");
                System.out.print("Please enter your password: ");
                inputPassword = scanner.nextLine();
            }
            count++;
        }

        if(inputPassword.equals(correctPassword)){
            System.out.print("Access granted. Would you like to play a game?");
        }

    }
}
