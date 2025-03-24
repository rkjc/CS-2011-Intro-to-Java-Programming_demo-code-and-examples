package Methods;

public class MethodsDemo02 {

    static boolean debugf = false;

    static int mainVal = 0;
    static int remainder = 0;


    public static void main(String[] args) {
        System.out.println("\n------ MethodsDemo02 is running -------\n");

        modulusFracture(29, 3);
        System.out.println(mainVal);
        System.out.println(remainder);
        
        modulusFracture(131, 5);
        System.out.println(mainVal);
        System.out.println(remainder);
        


        // int bobnum = 54;
        // int zondar = 101;

        // int thsum = addTwoNum(bobnum, zondar);
        // System.out.println(thsum);
        
        // -------------------
        // double dnuma = 234.09;
        // double dnumb = 101.27;

       
        // System.out.println("about to call this method: addTwoNum(dnuma, dnumb)");
        
        // double dsum = addTwoNum(dnuma, dnumb);
        // //System.out.println("addTwoNum(dnuma, dnumb); " + dsum);
        // //System.out.println();


        // double xsum = addTwoNum(87, 3.45);
        // System.out.println(xsum);

        // // double xsum = addTwoNum(87, 78);
        // // System.out.println(xsum);
        
        // int bob = 76;
        // double zen = 999;

        // System.out.println(addTwoNum(13, 42 ));

        // System.out.println(addTwoNum(8.123, 0.111));

        
        allDone();
       
    } 

    // ----- method definitions -------

    public static int addTwoNum(int numa, int numb){
        System.out.println("int addTwoNum(int numa, int numb) ");
        boolean bob = debugf;

        return numa + numb;
    }

    public static double addTwoNum(double numa, double numb){
        System.out.println("double addTwoNum(double numa, double numb) ");
        return numa + numb;
    }

    public static void modulusFracture(int val, int divisor){
        // main value return, remainder return

        remainder = val % divisor;
        mainVal = val / divisor;
        
    }


    public static void allDone(){
        System.out.println("-------- MethodsDemo02 ended ---------");
    }

}