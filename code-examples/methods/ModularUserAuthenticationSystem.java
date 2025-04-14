package methods;


import java.util.Scanner;

public class ModularUserAuthenticationSystem {
    
    // ----- declare and initialize global variables -----
    
    //static Scanner scanner = new Scanner(System.in);


    // ----- main method ------

    public static void main(String[] args) {

        Scanner zcanner = new Scanner(System.in);

        String storedUsername;
        String storedPassword;

        // start the while loop here while(check condition is still true){

        //storedUsername = inputUsername();
        storedUsername = inputUsername(zcanner);
        //storedPassword = inputPassword();
        storedPassword = inputPassword(zcanner);
        // boolean credentialsValid = validateCredentials(storedUsername, storedPassword);
        
        // debug test to make sure it worked
        
        System.out.println("password is: " + storedPassword);
        System.out.println("username is: " + storedUsername);

        // bla bla bla

        // } end the while loop here 

        // Maybe some extra code to finalize things and clean up some details

        // close the scanner to be safe
        //zcanner.close();
    }

    // ---- methods ----

    // public static String inputUsername() {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter username: "); 
    //     String inputLine = scanner.nextLine();
    //     //scanner.close();
    //     return inputLine;
    // }

    public static String inputUsername(Scanner scanin) {
        System.out.print("Enter username: "); 
        String inputLine = scanin.nextLine();
        return inputLine;
    }
    
    // public static String inputPassword() {
    //     //Prompt user to enter password
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter password: ");
    //     String inputLine = scanner.nextLine();
    //     return inputLine;
    // }

    public static String inputPassword(Scanner scanin) {
        //Prompt user to enter password
        System.out.print("Enter password: ");
        String inputLine = scanin.nextLine();
        return inputLine;
    }

}

