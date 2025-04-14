package arrays;


public class PassArrayToMethod_02 {
    


// -------------------- main method ----------------------------
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        int aNumber = 1001;
        int[] numbers = {67,3,0,12,3,99};


        System.out.println("inside main, heap address of arry numbers before call method:  " + numbers);

        System.out.print("inside main, content of array numbers before call method:  ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("inside main, value of int variable before calling methodl:  " + aNumber);

        System.out.println("--- inside main, calling method printAndChangeArray ---");

        printAndChangeArray(aNumber, numbers);

        System.out.println("--- inside main, returning from method printAndChangeArray ---");

        System.out.println("inside main, heap address of arry numbers after calling method:  " + numbers);

        System.out.print("inside main, contents of array numbers after call:  ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("inside main, contents of int variable after change  " + aNumber);

        System.out.println("-------- program ended ---------");
    } 

// -------------------- method definitions ----------------------------

    public static void printAndChangeArray(int nvar, int[] numsArr){
        System.out.println("------ entering method printAndChangeArray() ------");

        System.out.println("inside method, heap address of arry numbers before change:  " + numsArr);

        System.out.print("inside method, contents of array before change  ");
        for(int i = 0; i < numsArr.length; i++){
            System.out.print(numsArr[i] + " ");
        }
        System.out.println();

        // printing out values entering the method
        System.out.println("inside method, contents of int variable before change  " + nvar);

        // --------- changing values -------------------
        // change each value in array (add 7)
        for(int i = 0; i < numsArr.length; i++){
            numsArr[i] = numsArr[i] + 7;
        }

        // change value of int variable
        nvar = 990090099;

        // --- printing out values inside method after changing ----
        System.out.println("inside method, heap address of arry numbers after change:  " + numsArr);
        
        System.out.print("inside method, contents of array after change  ");
        for(int i = 0; i < numsArr.length; i++){
            System.out.print(numsArr[i] + " ");
        }
        System.out.println();

        System.out.println("inside method, contents of int variable after change  " + nvar);

        System.out.println("------ leaving method printAndChangeArray() ------");

    }

}
