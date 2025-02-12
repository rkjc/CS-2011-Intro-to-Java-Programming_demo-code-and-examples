package BooleanDataTypeAndIfStatements;

import java.util.Scanner;

public class GuessingGame01 {
    public static void main(String[] args) {
        Scanner zanner = new Scanner(System.in);
        String uguess = "";
        String numCheck = "";
        String userNum = "";

        System.out.println("------ program is running -------");
        System.out.println("Think of a number between 1 and 10 inclusive\n amd this program will guess your number.\n");

        numCheck = "0";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;
        }

        numCheck = "1";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;
        }

        numCheck = "2";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;        
        }

        numCheck = "3";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;        
        }

        numCheck = "4";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;        
        }

        numCheck = "5";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;        
        }

        numCheck = "6";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;        
        }

        numCheck = "7";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;        
        }

        numCheck = "8";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;       
        }

        numCheck = "9";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;       
        }

        numCheck = "10";
        System.out.print("Is your number "+numCheck+"? (y/n) ");
        uguess = zanner.nextLine();
        if(uguess == "y"){
            userNum = numCheck;    
        }

        System.out.print("You picked the number "+numCheck);

        
        System.out.println("-------- program ended ---------");
    } 
}
