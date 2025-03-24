package LOOPS;

public class WhileLoop01 { 
    public static void main(String[] args) {
        System.out.println("------ WhileLoop01 is running -------");

        String everything = "Sphinx of black quartz judge my vow";

        int i = 0;
        while (i < everything.length()) {

            System.out.print(everything.charAt(i) + " ");   
            i++;
        }
        System.out.println();

        System.out.println(i);
        System.out.println("-------- WhileLoop01 ended ---------");
    } 

}
