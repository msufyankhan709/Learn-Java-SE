package ArraysPackage;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] arr=new int[2][2][2];
        arr[0][0][0]=0;
        arr[0][0][1]=1;
        arr[0][1][0]=3;
        arr[1][0][0]=5;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    System.out.println(arr[i][j][j2]);
                }
            }
        }

    }
}
