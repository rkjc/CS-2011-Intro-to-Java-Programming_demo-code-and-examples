package BooleanDataTypeAndIfStatements;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        String zstr = "";

        zstr = "x";
        //zstr = "y";

        if(zstr == "y"){
            System.out.println("the string is a y");
        } else {
            System.out.println("the string is NOT a y");
        }


        // Now we do the same thing using a String from keyboard input
        Scanner zanner = new Scanner(System.in);
        System.out.print("input a value to check ");

        // String usrInput = "";
        // usrInput = zanner.nextLine();

        String usrInput = zanner.nextLine();

        if(usrInput == "y"){
            System.out.println("the string is a y");
        } else {
            System.out.println("the string is NOT a y");
        }

        System.out.println("-------- program ended ---------");
    } 
}
