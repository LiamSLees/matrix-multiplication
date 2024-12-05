import edu.princeton.cs.algs4.Stopwatch;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the amount of rows: ");
        int numRows = scnr.nextInt();

        System.out.println("Enter the amount of columns: ");
        int numCols = scnr.nextInt();

        int[][] A = new int[numCols][numRows];
        int[][] B = new int[numCols][numRows];


        //1st array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                A[i][j] = random.nextInt(100); // Generate random integer between 0 and 99
            }
        }
        //2nd array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                B[i][j] = random.nextInt(100); // Generate random integer between 0 and 99
            }
        }


        int n = numRows; // Number of rows in A
        int m = numCols; // Number of columns in A (or rows in B)
        int p = numCols; // Number of columns in B

        int[][] C = new int[n][p]; // Result matrix


        Stopwatch stopwatch = new Stopwatch();


        // matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < m; k++) {
                    sum = sum + (A[i][k] * B[k][j]);
                }
                C[i][j] = sum;
            }
        }


        // Print matrix C
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        double timer = stopwatch.elapsedTime();
        System.out.println("Time: " + timer);
    }
}
