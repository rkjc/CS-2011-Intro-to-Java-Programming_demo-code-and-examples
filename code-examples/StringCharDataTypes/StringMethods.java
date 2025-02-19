package StringCharDataTypes;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("------ StringMethods is running -------");

        String text = "Hello";

        System.out.println("Length: " + text.length());

        char firstChar = text.charAt(0);
        System.out.println("First character: " + firstChar);

        System.out.println("before " + text);
        String greeting = text.concat(" World!");
        //String greeting = text + " World!";
	    System.out.println(greeting); // Output: Hello World!
        

        System.out.println(text.toUpperCase());  // Output: HELLO
        System.out.println(text.toLowerCase());  // Output: hello


        System.out.println("after " + text);

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
    
        System.out.println("-----------------");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        System.out.println("(str1 == str2) " + (str1 == str2));
        System.out.println("(str1 == str3) " + (str1 == str3));
        System.out.println("(str1.equals(str2)) " + str1.equals(str2));
        System.out.println("(str1.equals(str3)) " + str1.equals(str3));
            


        System.out.println("-------- program ended ---------");
    } 
}
