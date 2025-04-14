package methods;

public class SuperSuperSimpleMethodDemo {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        int numA = 99;
        int numB = 24;

        int sum = add(numA, numB);

        System.out.println(sum);

        System.out.println("-------- program ended ---------");
    } 

    public static int add(int firstNum, int secondNum){
        int tempSum = firstNum + secondNum;
        return tempSum;
    }
}
