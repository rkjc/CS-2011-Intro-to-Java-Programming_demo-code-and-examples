package StringCharDataTypes;

public class StringMethodsExtended01 {
    public static void main(String[] args) {
        System.out.println("------ StringMethodsExtended01 is running -------");
        // ----------------------------------------------
        // .equals() 
        String str1 = "hello";
        String str2 = "hello";

        if (str1.equals(str2)) {
            System.out.println("The strings are equal!");
        }

        // ----------------------------------------------
        //  == operator
        if (str1 == str2) {
            System.out.println("The strings are equal!");
        }

        // ----------------------------------------------
        //  length()
        String password = "myPassword";
        int length = password.length();
        System.out.println("Password length: " + length);

        // ----------------------------------------------
        //  charAt()
        password = "myPassword";
        char firstChar = password.charAt(0);
        System.out.println("The first character is: " + firstChar);

        String username01 = "Zstudentkjfalsdfiwuertidfgoi;wueo9r87t02437ioter12345#zoomtow";
        int strlen = username01.length();
        System.out.println("The password length is: " + strlen);

        char lastthing = username01.charAt(strlen - 1);
        System.out.println("The last characters is: " + lastthing);

        // ----------------------------------------------
            //  substring()
        String username = "blamborger-rodawar, steve";

        String prefix = username.substring(0, 3);

        int firstNameLetterIndex = (username.indexOf(',')) + 2;

        String firstname = username.substring(firstNameLetterIndex, username.length());

        System.out.println("The first three characters are: " + prefix);
        System.out.println("first name: " + firstname);

        // i need an index finder





         // ----------------------------------------------
            //  indexOf() 
            String password03 = "myPassword123!";

            int specialCharIndex = password03.indexOf('!');

            if (specialCharIndex != -1) {
                System.out.println("Special character found at index: " + specialCharIndex);
            } else {
                System.out.println("No special character found.");
            }

       

        // ----------------------------------------------
            //  the + operator used to concatenate strings 
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);


        
        // ----------------------------------------------
            //  concat() 
        String str1b = "Hello";
        String str2b = "World";
        String result = ( str1b.concat(" ") ).concat(str2b);
        System.out.println(result);

        System.out.println(   (  str1b.concat("_")  ).concat(str2b)    );
        
        String junk1 = "hey there the end is near";
        String junk2 = "Nice day and the ocean";

        System.out.println(junk1);
        junk1 = junk1.substring(10, junk1.length());
        System.out.println(junk1);

        //String junk3 = junk2.substring(0, 13);

        int num = 768;
        int num2 = 98765;
        String combined = "number of the game: " + num ;
        System.out.println("number of the game: " + num + " " + junk2 + (num + num2));

        // ----------------------------------------------


        System.out.println("-------- program ended ---------");
    } 
}
