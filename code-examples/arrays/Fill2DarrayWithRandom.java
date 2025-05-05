package arrays;

import java.util.Random;

public class Fill2DarrayWithRandom {
    
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        // replace with user input
        int rows = 12;
        int cols = 7;


        int[][] twoArr = new int[rows][cols];

        fill2DarrayRandom(twoArr);
        print2DArrayContents(twoArr);

        int numOfElements = totalNumOfElements(twoArr);
        System.out.println("numOfElements " + numOfElements);

        int numOfElements2 = totalNumOfElements(rows, cols);
        System.out.println("numOfElements " + numOfElements2);



        System.out.println("-------- program ended ---------");
    } 


    public static void printArrayContents(int[] inarr){
        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }
        System.out.println();
    }

    public static void print2DArrayContents(int[][] inarr){
        for(int row = 0; row < inarr.length; row++){
            for(int col = 0; col < inarr[row].length; col++){
                
                System.out.print(inarr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void fill2DarrayRandom(int[][] inparr){
        Random rand = new Random();
        for(int row = 0; row < inparr.length; row++){
            for(int col = 0; col < inparr[row].length; col++){
                int tempRand = (rand.nextInt(900)) + 100;
                inparr[row][col] = tempRand;
            }
        }
    }

    public static int totalNumOfElements(int[][] inarr){
        int tot = inarr.length * inarr[0].length;
        return tot;
    }

    public static int totalNumOfElements(int row, int col){
        int tot = row * col;
        return tot;
    }



}
