package StringCharDataTypes;

import java.util.Scanner;

public class EscapeSequences1 {
    public static void main(String[] args) {
        System.out.println("------ EscapeSequences1 is running -------");

        // New Line
		System.out.println("Hello\nWorld!");

		// Output:
			// Hello
			// World!

		// Tab
		System.out.println("Java \t Programming");

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("this is an example of writting on the same line\r");
        scanner.nextLine();

        System.out.print("where it just keeps using the same space        \r");
        scanner.nextLine();

        System.out.print("to give output that does not scroll              \r");
        scanner.nextLine();


		// Output:
		// Java		Programming

        System.out.println("-------- program ended ---------");
        
    } 

// Notes on additional escape codes   
    //   \n – New Line
    //   \t – Tab
    //   \\ – Backslash
    //   \" – Double Quote
    //   \' – Single Quote
    //   \r – Carriage Return
    //   \b – Backspace
    //   \ u#### – Unicode escape (e.g., \u0041 for 'A') 

}


  



