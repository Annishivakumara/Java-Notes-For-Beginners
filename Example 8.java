import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Check if the character is a vowel
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
            character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("The character is a vowel.");
        }
        if (character != 'a' && character != 'e' && character != 'i' && character != 'o' && character != 'u' &&
            character != 'A' && character != 'E' && character != 'I' && character != 'O' && character != 'U') {
            System.out.println("The character is not a vowel.");
        }
      
    }
}
