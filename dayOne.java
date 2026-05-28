import java.util.Scanner;

public class dayOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1 - Sum of first N natural numbers
        System.out.println("Q1 - Sum of First N Natural Numbers");
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        // Q2 - Multiplication Table
        System.out.println("\nQ2 - Multiplication Table");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // Q3 - Factorial of a Number
        System.out.println("\nQ3 - Factorial of a Number");
        System.out.print("Enter a number: ");
        int factNum = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= factNum; i++) {
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);

        // Q4 - Count Digits in a Number
        System.out.println("\nQ4 - Count Digits in a Number");
        System.out.print("Enter a number: ");
        int digitNum = sc.nextInt();

        int count = 0;
        int temp = Math.abs(digitNum);

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}