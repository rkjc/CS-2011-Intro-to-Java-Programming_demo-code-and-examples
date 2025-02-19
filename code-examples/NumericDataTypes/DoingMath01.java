package NumericDataTypes;



public class DoingMath01 {

    public static void main(String[] args) {
        System.out.println("------ program DoingMath01 is alive -------");

        int a = 10;
        int b = 3;


        int c = 0;
        c = (a + 3*b) * (a*b);
        
         System.out.println("Addition: " + (a + b) ); // 13
        
         System.out.println("Subtraction: " + (a - b)); // 7
        
         System.out.println("Multiplication: " + (a * b)); // 30
        
         System.out.println("Division: " + (a / b)); // 3
        
         System.out.println("Modulus: " + (a % b)); // 1


        int val = 7;
        int exp = 2;
        double answer = 0;

        answer = Math.random();
        answer *= 100;
        int inrand = (int)answer;
        System.out.println("random: " + inrand);

        
        int blint = 0;
        double zondub = 57.94;

        blint = (int)(zondub);


        System.out.println(blint);




    }

}
