package Methods;

public class MethodsDemo01 {

    public static void main(String[] args) {
        System.out.println("------ MethodsDemo01 is running -------");

        int bobnum1 = 54;
        int num2 = 101;

        addTwoIntsPrint(bobnum1, num2);

        //bleen = 987;

        // int oldsum = num1 + num2;

        //int newsum = addTwoInts(bobnum1, num2);
 
        //System.out.println(newsum);

        allDone();
    } 

    // ----- method definitions -------

    public static int addTwoInts(int bobnum1, int zondar){
        int mesome = bobnum1 + zondar;
        return mesome;
    }

    public static void addTwoIntsPrint(int bobnum1, int zondar){
        int sum = addTwoInts(bobnum1, zondar);
        System.out.println(sum);
    } 

    public static void allDone(){
        System.out.println("-------- MethodsDemo01 ended ---------");
    }

}