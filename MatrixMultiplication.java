import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1, col1, row2, col2;

        System.out.println("Enter the number of rows and columns of the first matrix:");
        row1 = sc.nextInt();
        col1 = sc.nextInt();

        System.out.println("Enter the number of rows and columns of the second matrix:");
        row2 = sc.nextInt();
        col2 = sc.nextInt();

        if (col1 == row2) {
            int[][] a1 = new int[row1][col1];
            int[][] a2 = new int[row2][col2];
            int[][] result = new int[row1][col2];

            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    a1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    a2[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }

            System.out.println("The product is:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible.");
        }
    }
}
