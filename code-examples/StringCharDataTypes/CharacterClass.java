package StringCharDataTypes;

public class CharacterClass {
    public static void main(String[] args) {
        System.out.println("------ CharacterClass is running -------");

        char cvar = 'R';

		System.out.println("Character.isLetter(cvar)  " + Character.isLetter(cvar)  );
		System.out.println("Character.isDigit(cvar)  " + Character.isDigit(cvar)  );


		if (Character.isLetter(cvar)) {
			System.out.println(cvar + " is a letter.");
		}

		if (Character.isUpperCase(cvar)) {
			System.out.println(cvar + "  is uppercase.");
		}

        System.out.println("-------- program ended ---------");
    } 
}

// Character.isDigit(char) - Tests if the character is a digit.
// Character.isLetter(char) - Tests if the character is a letter.
// Character.isUpperCase(char) - Tests if the character is uppercase.
// Character.isLowerCase(char) - Tests if the character is lowercase.