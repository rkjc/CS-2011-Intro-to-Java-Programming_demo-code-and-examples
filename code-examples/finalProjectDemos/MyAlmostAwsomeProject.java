package finalProjectDemos;

import java.util.Scanner;

public class MyAlmostAwsomeProject {
    
    public static void main(String[] args) {
        System.out.println("------ program is running -------");


        int myvariable = 6787;

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("You slowly regain your senses and find yourself standing in a drak mysterious forest.");
        System.out.println("It looks like you have two options (1) head into the forest or (2) open the rusty gate blocking the cave entrance in front of you");

        
        int playerChoice = scanner.nextInt();

        if (playerChoice == 1){
            System.out.println("YOU DIED!");
        } else { 
             System.out.println("you enter the cave ... dant dant daaa *ominus music plays");
        }

       

        // Close the scanner
        scanner.close();




        System.out.println("-------- program ended ---------");
    } 

}