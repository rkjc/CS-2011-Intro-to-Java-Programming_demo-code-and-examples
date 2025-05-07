package arrays;

public class ArrayDemo2D_02 {

    public static void main(String[] args) {
        System.out.println("------ program is running -------\n");


         // Declare a 2D array
        int[][] numbArr  = { 
               {1, 12, 9, 7}, 
               {2, 21, 19, 34}, 
               {4, 39, 10, 11}
            };

        int totalSum = 0;
        int itemCount = 0;

        for( int row = 0; row < numbArr.length; row++){
            for( int col = 0; col < numbArr[row].length; col++){
                totalSum = totalSum + numbArr[row][col];
                itemCount++;
            }
        }

        System.out.println("totalSum = " + totalSum);
        System.out.println("itemCount = " + itemCount);


        double theAverage = (double)totalSum / (double)itemCount;
        //double theAverage = totalSum / itemCount;
        System.out.println("average of values = " + theAverage);


      System.out.println("-------- program ended ---------");
    } 


// ------ PRINTING ARRAY CONTENTS ------

    public static void printArrayContents(int[] inarr){

        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }

        System.out.println();
    }
    
    public static void print2DArrayContents(int[][] inArr){
        for( int row = 0; row < inArr.length; row++){
            for( int col = 0; col < inArr[row].length; col++){
                System.out.print(inArr[row][col] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void print2DArrayContents(String[][] inArr){
        for( int row = 0; row < inArr.length; row++){   
            for( int col = 0; col < inArr[row].length; col++){
                System.out.print(inArr[row][col] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }


}

