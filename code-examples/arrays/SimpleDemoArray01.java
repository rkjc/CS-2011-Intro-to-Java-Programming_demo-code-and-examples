package arrays;

public class SimpleDemoArray01 {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        int[] numbarr;
        numbarr = new int[100];

        for(int i = 0; i < numbarr.length; i++){
            numbarr[i] = -1;
        }
       
        
        numbarr[0] = 13;
        numbarr[1] = 27;
        numbarr[2] = 54;
        numbarr[3] = 8;
        numbarr[4] = 31;
        numbarr[5] = 0;
        numbarr[6] = 1001;

        int numbarr1 = 77;
        int numbarr2 = 31;

        System.out.print( numbarr1 );
        System.out.print( " ");
        System.out.println( numbarr2 );


        System.out.println( numbarr[2] );
        
        for(int i = 0; i < numbarr.length; i++){
            if(numbarr[i] == -1){
                break;
            } else {
                System.out.print( numbarr[i] );
                System.out.print(" ");
            }
        }
        System.out.println( );

        String zonk = "the mighty river covers the land with mud";

        for(int i = 0; i < zonk.length(); i++){
            System.out.print( zonk.charAt(i) );
            System.out.print(" ");
        }
        System.out.println( );

        int[] numbers = {13, 27, 54, 8, 31,0 , 77, 23, 14, 0};

        int[] morenumbers = new int[numbers.length + 5];

        

        for(int i = 0; i < numbers.length; i++){
            System.out.print( numbers[i] );
            System.out.print(" ");
        }
        System.out.println( );


        for(int i = 0; i < numbers.length; i++){
             morenumbers[i]  = numbers[i];
        }
        System.out.println( );

        for(int i = 0; i < morenumbers.length; i++){
            System.out.print( morenumbers[i] );
            System.out.print(" ");
        }
        System.out.println( );
        // ------------------------------------

        morenumbers[4] = 10000001;

        for(int i = 0; i < numbers.length; i++){
            System.out.print( numbers[i] );
            System.out.print(" ");
        }
        System.out.println( );


        for(int i = 0; i < morenumbers.length; i++){
            System.out.print( morenumbers[i] );
            System.out.print(" ");
        }
        System.out.println( );

        System.out.println("-------- program ended ---------");
    } 
}
