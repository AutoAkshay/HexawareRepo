package basicJava.zzarray;

import java.util.*;


public class Interview {
    public static void main(String[] args) {

        Integer[][] matrix = {{1, 2 ,3}, {4, 5,6},{7,8,9}};

// Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

// Reverse each row
        int n = matrix.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }

            System.out.println();
        }

    }
}

