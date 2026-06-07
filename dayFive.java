import java.util.Scanner;

public class dayFive {

    // Q17: Check Perfect Number
    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    // Q18: Check Strong Number
    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == original;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Q19: Print Factors of a Number
    public static void printFactors(int num) {
        System.out.print("Factors: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Q20: Find Largest Prime Factor
    public static int largestPrimeFactor(int num) {
        int largestFactor = -1;

        while (num % 2 == 0) {
            largestFactor = 2;
            num /= 2;
        }

        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                largestFactor = i;
                num /= i;
            }
        }

        if (num > 2) {
            largestFactor = num;
        }

        return largestFactor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Q17
        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }

        // Q18
        if (isStrong(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is not a Strong Number.");
        }

        // Q19
        printFactors(num);

        // Q20
        System.out.println("Largest Prime Factor: " + largestPrimeFactor(num));

        sc.close();
    }
}