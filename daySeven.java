import java.util.Scanner;

public class daySeven {

    // Q25: Recursive Factorial
    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Q26: Recursive Fibonacci
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Q27: Recursive Sum of Digits
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    // Q28: Recursive Reverse Number
    static int reverseNumber(int n, int rev) {
        if (n == 0)
            return rev;
        return reverseNumber(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q25
        System.out.print("Enter a number for factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Factorial = " + factorial(factNum));

        // Q26
        System.out.print("\nEnter position for Fibonacci series: ");
        int fibNum = sc.nextInt();
        System.out.println("Fibonacci Number = " + fibonacci(fibNum));

        // Q27
        System.out.print("\nEnter a number to find sum of digits: ");
        int sumNum = sc.nextInt();
        System.out.println("Sum of Digits = " + sumOfDigits(sumNum));

        // Q28
        System.out.print("\nEnter a number to reverse: ");
        int revNum = sc.nextInt();
        System.out.println("Reversed Number = " + reverseNumber(revNum, 0));

        sc.close();
    }
}
