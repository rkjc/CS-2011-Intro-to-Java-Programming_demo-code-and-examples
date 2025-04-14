import java.util.Random;

public class QuickProg02 {
    
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

      

        String functionSymbol = "+";
        int num1 = 99;
        int num2 = 45;
        int sum = num1 + num2;

        String mathFunc = "+";

        String formout = "Using the function " + mathFunc + " between the value " + num1 + " and the value " + num2 + " gives the result " + sum + ".";

        System.out.println(formout);

        System.out.println("------ program ended -------");
    }

    public static void formatedPrint(String funcStr, int n1, int n2, int result){
        System.out.println("Using the function " + funcStr + " between the value " + n1 + " and the value " + n2 + " gives the result " + result + ".");
    }

}
