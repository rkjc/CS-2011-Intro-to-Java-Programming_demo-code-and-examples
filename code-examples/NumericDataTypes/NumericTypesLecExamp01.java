package NumericDataTypes;
import java.util.Scanner;

public class NumericTypesLecExamp01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter an int value: "); 
        int intValue = scanner.nextInt(); 
        //String intValue = scanner.nextLine();

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble(); 

        System.out.println("Your int is = " + intValue);

        // Perform operations (This part will be completed by you)
        scanner.close();
    }
} 




//   // Reading different numeric types
//   System.out.print("Enter a byte value: ");
//   byte byteValue = scanner.nextByte();

//   System.out.print("Enter a short value: "); 
//   short shortValue = scanner.nextShort(); 

//   System.out.print("Enter a long value: ");
//         long longValue = scanner.nextLong();

//         System.out.print("Enter a float value: ");
//         float floatValue = scanner.nextFloat();

