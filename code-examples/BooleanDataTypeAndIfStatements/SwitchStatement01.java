package BooleanDataTypeAndIfStatements;

public class SwitchStatement01 {
    public static void main(String[] args) {
        System.out.println("------ SwitchStatement01 is running -------");

        int bob = 0;

        switch (bob){
            case 1:
                System.out.println("yep it works, picked #1");
                break;
            case 2:
                System.out.println("yep also works, picked #2");
                break;

            default:
                System.out.println("did the default, did not use 1 or 2");
        } 


        System.out.println("-------- program ended ---------");
    } 
}
