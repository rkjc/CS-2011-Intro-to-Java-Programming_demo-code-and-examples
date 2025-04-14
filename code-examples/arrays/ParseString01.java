package arrays;

import java.util.Scanner;

public class ParseString01 {
    public static void main(String[] args) {
        System.out.println("------ program is running -------");
        Scanner zcanner = new Scanner(System.in);

        System.out.print("enter list of names => ");
        String lNameList = zcanner.nextLine();
        System.out.println();
        System.out.println("the string of names entered:");
        System.out.println(lNameList);

        int count = lNameList.length() - lNameList.replace(";", "").length();
        System.out.println(count);

        int nextSC = 0;

        nextSC = lNameList.indexOf(";");
        System.out.println(nextSC);
        String lnam1 = lNameList.substring(0, nextSC);
        System.out.println(lnam1);
        lNameList = lNameList.substring(nextSC + 1, lNameList.length() );
        System.out.println(lNameList);

        nextSC = lNameList.indexOf(";");
        System.out.println(nextSC);
        String lnam2 = lNameList.substring(0, nextSC);
        System.out.println(lnam2);
        lNameList = lNameList.substring(nextSC + 1, lNameList.length() );
        System.out.println(lNameList);

        nextSC = lNameList.indexOf(";");
        System.out.println(nextSC);
        String lnam3 = lNameList.substring(0, nextSC);
        System.out.println(lnam3);
        lNameList = lNameList.substring(nextSC + 1, lNameList.length() );
        System.out.println(lNameList);

        nextSC = lNameList.indexOf(";");
        System.out.println(nextSC);
        String lnam4 = lNameList.substring(0, nextSC);
        System.out.println(lnam4);
        lNameList = lNameList.substring(nextSC + 1, lNameList.length() );
        System.out.println(lNameList);

        nextSC = lNameList.indexOf(";");
        System.out.println(nextSC);
        String lnam5 = lNameList.substring(0, nextSC);
        System.out.println(lnam5);
        lNameList = lNameList.substring(nextSC + 1, lNameList.length() );
        System.out.println(lNameList);

        String fnam1 = "Zondar";

        String outputstr = fnam1 + " " + lnam1 + ";";

        System.out.println(outputstr); 
        //outputstr = outputstr + fnam2 + " " + lnam2 + ";";

        System.out.println();

        // Moore;Perry;Wright;Turner;Ward;;;
        // Jacob;Raven;Tim;Angie;Niko; 

        System.out.println("-------- program ended ---------");
    } 
}
