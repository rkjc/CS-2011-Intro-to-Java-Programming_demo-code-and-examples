package BooleanDataTypeAndIfStatements;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");
        Scanner zanner = new Scanner(System.in); // used later

        // This version of string comparison 'seems' to work, but don't trust it.
        String zstr = "";
        //zstr = "x";
        zstr = "y";

        if(zstr == "y"){
            System.out.println("the string is a y");
        } else {
            System.out.println("the string is NOT a y");
        }

        System.out.println("--------------------------------");
        // this version of the string comparison does NOT work
        // Now we do the same thing using a String from keyboard input
        // this version does not work (try entering a y)

        System.out.print("input a value to check ");
        String usrInput = zanner.nextLine();

        System.out.println("you entered " + usrInput);

        if(usrInput == "y"){
            System.out.println("the string is a y");
        } else {
            System.out.println("the string is NOT a y");
        }

        System.out.println("--------------------------------");
        // this version of the string comparison works
        // if you need to compare strings for equality
        // use the form strOne.equals(strTwo)

        System.out.print("input another value to check ");
        String altInput = zanner.nextLine();

        if( altInput.equals("y") ){
            System.out.println("the string is a y");
        } else {
            System.out.println("the string is NOT a y");
        }

        System.out.println("-------- program ended ---------");
    } 
}
