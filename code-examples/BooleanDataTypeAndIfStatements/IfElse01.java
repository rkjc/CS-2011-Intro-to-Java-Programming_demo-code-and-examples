package BooleanDataTypeAndIfStatements;

public class IfElse01 {
    
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        boolean mecheck = false;

        if( mecheck ){
            System.out.println("mecheck was true");
        } else {
            System.out.println("mecheck was NOT true");
            
            int a = 5;
            int b = 7;

            if( a > b ){
                System.out.println("a greater b");
            } else {
                System.out.println("a not greater b");
            }
        }

        boolean zone = false;
        boolean ztwo = true;


        // implementing an AND(&&) function
        // if(zone == true){
        //     if(ztwo == true){
        //         System.out.println("true");
        //     } else {
        //         System.out.println("false");
        //     }
        // } else {
        //     System.out.println("false");
        // }

        // ----
        zone = true;
        ztwo = true;

        boolean result = false;
        if(zone == true){
            if(ztwo == true){
                result = true;
            } 
        }
        System.out.println(result);


        System.out.println("-------- program ended ---------");
    } 
}
