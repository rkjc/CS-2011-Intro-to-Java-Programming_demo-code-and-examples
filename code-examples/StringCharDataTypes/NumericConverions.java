package StringCharDataTypes;

import java.util.HexFormat;
import java.util.Scanner;

public class NumericConverions {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        // String numo = "456";

        // int numIn = Integer.parseInt(numo);

        // int num1 = 45;
        // int num2 = 99;

        // System.out.println( numIn + num2 );

        Scanner myzanner = new Scanner(System.in);

        // // Prompt the user for their digit
        System.out.print("Enter a single hexidecimal digit ");

        String mystr = myzanner.nextLine();

        if( mystr.length() != 1 ){
            System.out.println("must be a single hex digit");
        } else {
            char mychar = mystr.charAt(0);
            int in1 = Character.digit(mychar, 16);

            if (in1 < 0){
                System.out.println("input digit is not a hexidecimal value");
            } else {
                System.out.println("Numeric value of " + mychar + " in radix " + 16 + " is " + in1); 
            }
        }

        System.out.println("-------- program ended ---------");
    } 
}
