package LOOPS;

import java.util.Random;

public class ForEachLoop {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        Random rand = new Random();

        int[] bob = new int[7];
        fillArrayRandom(bob);

        // using for-each loop
        for(int tempVal : bob){
            System.out.print(tempVal + " ");
        }
        System.out.println();


       // printArrayContents(bob);


        System.out.println("-------- program ended ---------");
    } 

    public static void printArrayContents(int[] inarr){
        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArrayRandom(int[] inparr){
        Random rand = new Random();
        
            for(int col = 0; col < inparr.length; col++){
                int tempRand = (rand.nextInt(900)) + 100;
                inparr[col] = tempRand;
            }
        
    }

}
