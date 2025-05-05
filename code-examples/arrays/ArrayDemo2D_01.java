package arrays;

public class ArrayDemo2D_01 {

    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        int[][] zork = new int[20][20];
        print2DArrayContents(zork);

        //print2DArrayContents();

        int[] oneDArr  = {55,56,57,58};

         // Declare a 2D array
        int[][] matrix  = { 
               {0, 0, 99, 0}, 
               {0, 3, 0, 13, 645, 22,0,1,45}, 
               {8, 0, 10, 11},
               {100, 0, 88, 0}
         };

         print2DArrayContents(matrix);

         String[][] myMap  = { 
            {"-", "-", "-", "-"},
            {"|", " ",  " ", "|"}, 
            {"|", " ", "X", "|"}, 
            {"|", "E", " ", "|"},
            {"|", " ", " ", "|"},
            {"-", "-", "-", "-"}
      };

      print2DArrayContents(myMap);

      System.out.println("array contents " + matrix);

      System.out.println("-------- program ended ---------");
    } 


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

