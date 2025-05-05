package arrays;

public class SuperSimpleDemoArray01 {
    public static void main(String[] args) {
        System.out.println("------ program is running -------\n");

        int[] zonk = new int[5];
        printArrayContents(zonk);

        zonk[2] = 99;
        printArrayContents(zonk);

        System.out.println("-------- program ended ---------");
    } 



    public static void printArrayContents(int[] inarr){
        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }
        System.out.println();
    }

}
