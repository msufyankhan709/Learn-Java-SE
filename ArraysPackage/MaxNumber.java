package ArraysPackage;

/**
 * Java Program to Find Largest Element of an Array
 */

public class MaxNumber {
    public static void main(String[] args) {
            int[] arr={10,20,30,40,50};
            int max=0;
            for (int i : arr) {
                if (max<i) {
                    max=i;
                }
            }
            int max2=0;
            for (int i = 0; i < arr.length; i++) {
                if (max2<arr[i]) {
                    max2=arr[i];
                }
            }
            System.out.println(max2);
            System.out.println(max);
    }
}
