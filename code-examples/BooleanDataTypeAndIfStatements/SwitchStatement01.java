package BooleanDataTypeAndIfStatements;

import java.util.Scanner;

public class SwitchStatement01 {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        // int day = 2;

        // switch (day) {    
        //     case 1   :   
        //         System.out.println("Monday");
        //         break;
        
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        
        //     default:
        //         System.out.println("Invalid day");
        // }

        String str = "";
        Scanner zanner = new Scanner(System.in);
        System.out.print("input a value to check ");

        str = zanner.nextLine();

        switch (str){
            case "s":
                System.out.println("selected s");
                break;
            
            case "d":
                System.out.println("selected d");
                break;

            case "z":
                System.out.println("selected z");
                break;
        }

        zanner.close();


        System.out.println("-------- program ended ---------");
    } 
}
