package ArraysPackage;

/**
 * Java Program to Add Two Matrix Using Multi-dimensional Arrays
 */

public class AddMatrices {
     public static void main(String[] args) {
         int rows=2, columns=3;
         int[][] firstMatrix={{10,9,8},{7,6,5}};
         int[][] secondMatrix={{5,4,3},{2,1,0}};
         int[][] sum= new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }
        System.out.println("Sum of matrices is: ");
        for (int[] row : sum) {
            for (int column: row) {
                System.out.println(column+ " ");
            }
            System.out.println();
        }
     }   
}
