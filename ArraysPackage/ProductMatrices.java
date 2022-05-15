package ArraysPackage;

public class ProductMatrices {
    public static void main(String[] args) {
        int r1=2,c1=3;
        int r2=3,c2=2;
        int[][] firstMatrix={{10,9,8},{7,6,5}};
        int[][] secondMatrix={{4,3},{2,1},{1,1}};
        int[][] ProductMatrices=new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ProductMatrices[i][j]+=firstMatrix[i][k]*secondMatrix[k][j];
                }
            }
        }
        System.out.println("Multiplication of two Matrices is: ");
        for (int[] row : ProductMatrices) {
            for (int column : row) {
                System.out.println(column+" ");
            }
            System.out.println();
        }
    }
}
