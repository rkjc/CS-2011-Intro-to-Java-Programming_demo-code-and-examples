package BooleanDataTypeAndIfStatements;

public class NestedIf01 {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        int zond = 75;
        int bleen = 45;

        if ((bleen + zond) > 99){
            if (bleen > zond){
                System.out.println("bleen is greater");
            }

            if (bleen < zond){
                System.out.println("zond is greater");
            }
        }

        if (bleen + zond <= 99){
            System.out.println("bleen plus zond are too small to matter");
        }

        System.out.println("-------- program ended ---------");
    }
}
