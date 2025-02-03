package LectureCodeExamples;

import java.util.Scanner;


public class InputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a byte: ");
        byte myByte = scanner.nextByte();

        System.out.print("Enter a floating-point number: ");
        float myFloat = scanner.nextFloat();


        System.out.println("You entered: " + myByte + " and " + myFloat );

    }
}