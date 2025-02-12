package BooleanDataTypeAndIfStatements;

public class simpleIf1 {

    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        int a = 99;
        int b = 99;

        if( a > b ) { 
            System.out.println("variable a is greater than variable b");
        }

        if( a < b ){ 
            System.out.println("variable b is greater than variable a");
        } 
        
        if( a == b ){ 
            System.out.println("variable a equals variable b");
        } 

        System.out.println("------ program ended -------");
    } 
}
