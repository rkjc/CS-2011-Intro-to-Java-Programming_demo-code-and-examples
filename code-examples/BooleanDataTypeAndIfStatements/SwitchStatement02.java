package BooleanDataTypeAndIfStatements;

import java.util.Scanner;

public class SwitchStatement02 {
    public static void main(String[] args) {
        System.out.println("------ SwitchStatement02 is running -------");

        String str1 = "";
        Scanner zcanner = new Scanner(System.in);
        System.out.print("input a string (y,n,m) to check ");

        str1 = zcanner.nextLine();

        switch (str1){
            case "y":
                System.out.println("-> selected yes");
                break;
            
            case "n":
                System.out.println("-> selected no");
                break;

            case "m":
                System.out.println("-> selected maybe");
                break;
        }

        zcanner.close();


        System.out.println("-------- program ended ---------");
    } 
}


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
