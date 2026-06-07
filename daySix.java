import java.util.Scanner;

public class daySix {

    // Q21: Decimal to Binary
    public static void decimalToBinary(int decimal) {
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
    }

    // Q22: Binary to Decimal
    public static void binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimal);
    }

    // Q23: Count Set Bits
    public static void countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }

        System.out.println("Number of set bits: " + count);
    }

    // Q24: Find x^n without pow()
    public static void powerWithoutPow(int x, int n) {
        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Question:");
        System.out.println("21. Convert Decimal to Binary");
        System.out.println("22. Convert Binary to Decimal");
        System.out.println("23. Count Set Bits in a Number");
        System.out.println("24. Find x^n without pow()");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 21:
                System.out.print("Enter a decimal number: ");
                int decimal = sc.nextInt();
                decimalToBinary(decimal);
                break;

            case 22:
                System.out.print("Enter a binary number: ");
                String binary = sc.next();
                binaryToDecimal(binary);
                break;

            case 23:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                countSetBits(num);
                break;

            case 24:
                System.out.print("Enter base (x): ");
                int x = sc.nextInt();
                System.out.print("Enter exponent (n): ");
                int n = sc.nextInt();
                powerWithoutPow(x, n);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}