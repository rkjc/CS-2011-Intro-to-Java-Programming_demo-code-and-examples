package LOOPS;

import java.math.BigInteger;

public class ForLoop01 {
    public static void main(String[] args) {
        System.out.println("------ ForLoop01 is running -------");

        
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            System.out.println("Iteration: " + i + "  sum= " + sum);
        }

        System.out.println("sum: " + sum);

        String everything = "Sphinx of black quartz judge my vow";



        System.out.println("-------- ForLoop01 ended ---------");
    } 
}
