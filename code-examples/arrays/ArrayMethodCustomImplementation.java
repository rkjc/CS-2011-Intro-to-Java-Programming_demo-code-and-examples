package arrays;

import java.util.Arrays;

public class ArrayMethodCustomImplementation {

    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        String[] zork = {"x", "T", "S", "s", "r", "Z", "t"};

        printArrayContents(zork);
        Arrays.sort(zork);
        printArrayContents(zork);

        int[] numero = {76,3,9, 101, 3, 0, 37};

        printArrayContents(numero);
        Arrays.sort(numero);
        printArrayContents(numero);

        System.out.println("-------- program ended ---------");
    } 



    public static void printArrayContents(int[] inarr){
        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }
        System.out.println();
    }
    

    public static void printArrayContents(String[] inarr){
        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }
        System.out.println();
    }
}
