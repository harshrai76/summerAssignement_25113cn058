import java.util.Scanner;

public class dayTwo {

    // Q5 - Sum of digits
    static void sumOfDigits(int num) {
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }

    // Q6 - Reverse a number
    static void reverseNumber(int num) {
        int reverse = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed number = " + reverse);
    }

    // Q7 - Product of digits
    static void productOfDigits(int num) {
        int product = 1;
        int temp = num;

        while (temp != 0) {
            product *= temp % 10;
            temp /= 10;
        }

        System.out.println("Product of digits = " + product);
    }

    // Q8 - Check palindrome number
    static void palindromeCheck(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Q5
        sumOfDigits(num);

        // Q6
        reverseNumber(num);

        // Q7
        productOfDigits(num);

        // Q8
        palindromeCheck(num);

        sc.close();
    }
}