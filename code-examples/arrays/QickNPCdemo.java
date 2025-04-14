package arrays;

import java.util.Random;
import java.util.Scanner;

public class QickNPCdemo {
    
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        Scanner scanner = new Scanner(System.in);

        //System.out.println(firstNameArr,lastNameArr firstNames);

        String[] firstNameArr = new String[5];
        String[] lastNameArr = new String[5];
        String[] fullNamesArr = new String[5];

        // for(int i = 0; i < 5; i++ ){
        //     System.out.println(firstNameArr[i]);
        // }

        getNameInputFromUser(firstNameArr, lastNameArr, scanner);
        
        // for(int i = 0; i < 5; i++ ){
        //     System.out.println(firstNameArr[i]);
        // }
        
        for(int i = 0; i < 5; i++ ){
            String temps = firstNameArr[i] + " " + lastNameArr[i];
            fullNamesArr[i] = temps;
        }

        String printabelNameList = "";
        for(int i = 0; i < 5; i++ ){
            printabelNameList = printabelNameList + fullNamesArr[i] + ";";     
        }
        System.out.println(printabelNameList);


        Random ranndy = new Random();
        int mixedup = ranndy.nextInt(4);

        // first name list -  Jacob;Raven;Tim;Angie;Niko;
        // last name list - Moore;Perry;Wright;Turner;Ward;


        System.out.println("-------- program ended ---------");
    } 


    public static void getNameInputFromUser(String[] fNameArr, String[] sNameArr, Scanner scanner){
        System.out.print("Enter a string of 5 first names: ");
        String fNames = scanner.nextLine();
        System.out.println();
        //String fNames = "Jacob;Raven;Tim;Angie;Niko;";
        String[] tempfirstArr = fNames.split(";");

        for(int i = 0; i < 5; i++ ){
            fNameArr[i] = tempfirstArr[i] ;     
        }

        System.out.print("Enter a string of 5 last names: ");
        String sNames = scanner.nextLine();
        System.out.println();
        //String sNames = "Moore;Perry;Wright;Turner;Ward;";
        String[] tempLastArr = sNames.split(";");

        for(int i = 0; i < 5; i++ ){
            sNameArr[i] = tempLastArr[i];     
        }
    }
}
