package arrays;

public class PassArrayToMethod_03 {
    
    // demo that arr.split(";") creates a new array with a scope only inside the method

    // -------------------- main method ----------------------------
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        int[] numbers = {67,3,0,12,3,99};

        System.out.print("array inside main, before call:  ");
        printIntArrayContents(numbers);

        printAndChangeArrayContents(numbers);

        System.out.print("array inside main, after call:  ");
        printIntArrayContents(numbers);


        System.out.println("-------- program ended ---------");
    } 

// -------------------- method definitions ----------------------------

    public static void printAndChangeArrayContents(int[] nums){

        int[] local = nums;
        System.out.println(nums);
        System.out.println(local);
        
        System.out.print("array inside method before change:  ");
        printIntArrayContents(local);

        // change each value
        for(int i = 0; i < local.length; i++){
            nums[i] = local[i] + 7;
        }

        System.out.print("array inside method after change:  ");
        printIntArrayContents(local);
    }

    public static void testSplitWithArray(){
        // TODO
    } 


    public static void printIntArrayContents(int[] inarr){
        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }
        System.out.println();
    }

}
