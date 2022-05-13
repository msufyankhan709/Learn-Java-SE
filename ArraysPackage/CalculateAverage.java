package ArraysPackage;

/**
 * Program to Calculate Average Using Arrays
 */

public class  CalculateAverage {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int sum=0;  
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
        int average=sum/arr.length;
        System.out.println(average);
    }
}
