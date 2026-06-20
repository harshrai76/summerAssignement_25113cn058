import java.util.Scanner;

public class day20 {

    // Function to input a matrix
    static void inputMatrix(int[][] matrix, int rows, int cols, Scanner sc) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Q77: Multiply Matrices
    static void multiplyMatrices(Scanner sc) {
        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter first matrix:");
        inputMatrix(A, r1, c1, sc);

        System.out.println("Enter second matrix:");
        inputMatrix(B, r2, c2, sc);

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Q78: Check Symmetric Matrix
    static void checkSymmetric(Scanner sc) {
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix:");
        inputMatrix(matrix, n, n, sc);

        boolean symmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
            System.out.println("Matrix is Symmetric.");
        else
            System.out.println("Matrix is Not Symmetric.");
    }

    // Q79: Row-wise Sum
    static void rowWiseSum(Scanner sc) {
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix:");
        inputMatrix(matrix, rows, cols, sc);

        System.out.println("Row-wise Sum:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }

    // Q80: Column-wise Sum
    static void columnWiseSum(Scanner sc) {
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix:");
        inputMatrix(matrix, rows, cols, sc);

        System.out.println("Column-wise Sum:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Multiply Matrices");
        System.out.println("2. Check Symmetric Matrix");
        System.out.println("3. Find Row-wise Sum");
        System.out.println("4. Find Column-wise Sum");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                multiplyMatrices(sc);
                break;
            case 2:
                checkSymmetric(sc);
                break;
            case 3:
                rowWiseSum(sc);
                break;
            case 4:
                columnWiseSum(sc);
                break;
            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}