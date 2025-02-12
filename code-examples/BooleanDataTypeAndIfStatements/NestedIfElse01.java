package BooleanDataTypeAndIfStatements;

public class NestedIfElse01 {

    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        int a = 100;
        int b = 99;
        
        if( a == b ){ 
            System.out.println("variable a equals variable b");
        } else if( a > b ) { 
                System.out.println("variable a is greater than variable b");
            } else {  
                System.out.println("variable b is greater than variable a");
        } 

        System.out.println("------ program ended -------");
    } 
}
