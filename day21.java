import java.util.Scanner;

public class day21 {

    // Q81: Find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Q82: Reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Q83: Count vowels and consonants
    public static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    // Q84: Convert lowercase to uppercase
    public static String toUpperCaseManual(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Q81
        System.out.println("\nQ81: Length of String (without length())");
        System.out.println("Length = " + findLength(str));

        // Q82
        System.out.println("\nQ82: Reversed String");
        System.out.println(reverseString(str));

        // Q83
        System.out.println("\nQ83: Vowels and Consonants Count");
        countVowelsConsonants(str);

        // Q84
        System.out.println("\nQ84: Lowercase to Uppercase");
        System.out.println(toUpperCaseManual(str));

        sc.close();
    }
}