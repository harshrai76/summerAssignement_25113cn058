import java.util.Scanner;

public class dayFour {

    // Q13 - Generate Fibonacci Series
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // Q14 - Find nth Fibonacci Term
    public static int nthFibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1, next = 0;

        for (int i = 2; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }

        return b;
    }

    // Q15 - Check Armstrong Number
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    // Q16 - Print Armstrong Numbers in Range
    public static void printArmstrongInRange(int start, int end) {
        System.out.println("Armstrong Numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q13
        System.out.print("Enter number of terms for Fibonacci Series: ");
        int terms = sc.nextInt();
        generateFibonacci(terms);

        // Q14
        System.out.print("\nEnter n to find nth Fibonacci term: ");
        int n = sc.nextInt();
        System.out.println(n + "th Fibonacci term is: " + nthFibonacci(n));

        // Q15
        System.out.print("\nEnter a number to check Armstrong: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is not an Armstrong Number.");
        }

        // Q16
        System.out.print("\nEnter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        printArmstrongInRange(start, end);

        sc.close();
    }
}