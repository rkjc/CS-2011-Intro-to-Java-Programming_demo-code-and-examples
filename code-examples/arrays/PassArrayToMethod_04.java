package arrays;

public class PassArrayToMethod_04 {
    
    // demo that arr.split(";") creates a new array with a scope only inside the method

    // -------------------- main method ----------------------------
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        String[] numbers = {"one","two","three"};

        System.out.println("inside main, array  before call:  ");

        printArrayContents(numbers);

        printAndChangeArrayContents(numbers);

        System.out.println("array inside main, after call:  ");
        printArrayContents(numbers);


        System.out.println("-------- program ended ---------");
    } 

// -------------------- method definitions ----------------------------

    public static void printAndChangeArrayContents(String[] nums){

        String bob = "happy,joy,confused,peasful";

        String[] splitStr = bob.split(",");

        int asize = Math.min(nums.length, splitStr.length);

        for(int i = 0; i < asize; i++){
            nums[i] = splitStr[i];
        }

        System.out.println("in method after, nums addr: " + nums);
        
        System.out.println(nums);

        //System.out.println(local);
        
        System.out.print("array inside method before change:  ");
        printArrayContents(nums);

        // change each value
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] + 7;
        }

        System.out.print("array inside method after change:  ");
        printArrayContents(nums);

    }

    public static void testSplitWithArray(){
        // TODO
    } 


    public static void printArrayContents(int[] inarr){
        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }
        System.out.println();
    }
    

    public static void printArrayContents(String[] inarr){
        for(int i = 0; i < inarr.length; i++){
            System.out.print(inarr[i] + " ");
        }
        System.out.println();
    }
}
