package LOOPS;

public class NestedLoops01 {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");


        int sum = 0;
        // draw a triangle
        

        for (int i = 1; i <= 10000; i++) {

            for (int j = 0; j < 10000; j++) {
                
                    //System.out.print("*");
                    
                    if(j == 999){
                        break;
                    }

                    sum++;
            }
            //System.out.println();
            
        }

        //    *
        //    **
        //    ***
        //    **** 
        //    *****
        System.out.println(sum);


        System.out.println("-------- program ended ---------");
    } 
}
