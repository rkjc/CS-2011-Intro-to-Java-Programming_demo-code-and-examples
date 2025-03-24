package StringCharDataTypes;

public class TestForIncludedChar {
    public static void main(String[] args) {
        System.out.println("------ TestForIncludedChar is running -------");


        String specials = "!@#$%^&*()_-+=?><,.[]{}~";

        String mypass = "wombat56planet";

        String item = " ";
        boolean charCheck = false;

        for(int i = 0; i < mypass.length(); i++){
            item = Character.toString(mypass.charAt(i));
            System.out.print(item + " ");
            if(specials.contains(item)){
                charCheck = true;
            }
        }
        System.out.println();

        System.out.println(charCheck);


        System.out.println("-------- TestForIncludedChar ended ---------");
    } 
}
