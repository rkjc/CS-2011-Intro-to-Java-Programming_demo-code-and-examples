package methods;

public class ScopeDemo01 {

    static int instanceVar = 0;  // Instance variable


    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        instanceVar = 99;  // Instance variable
        System.out.println(demonstrateScope());

        instanceVar = 1001;  // Instance variable
        System.out.println(demonstrateScope());


        instanceVar = 3;  // Instance variable
        System.out.println(instanceVar);
        demonstrateScope2();
        System.out.println(instanceVar);



        System.out.println("-------- program ended ---------");
    } 



    public static int demonstrateScope() {
        
        return 10 + instanceVar;

    }

    public static void demonstrateScope2() {
        
        instanceVar = 777777;

    }

}
