package arrays;

import java.util.Random;
import java.util.Scanner;

public class TwoDArrayOutsideRing {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");


         Random randy = new Random();

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("enter number of columns between 5 and 10 inclusive: ");
        int cols = scanner.nextInt();

        System.out.print("enter number of rows between 5 and 10 inclusive: ");
        int rows = scanner.nextInt();

        System.out.println("number of rows is " + rows + "  and number of columns is " + cols);
        

        int[][] theArr = new int[rows][cols]; 

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                theArr[row][col] = (randy.nextInt(899) + 100);
            }

        }

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                System.out.print(theArr[row][col] + " ");
            }
            System.out.println();
        }


        // Close the scanner
        scanner.close();
        


        System.out.println("-------- program ended ---------");
    } 

    public static void printArrayContents(int[] inarr){
        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }
        System.out.println();
    }
}
