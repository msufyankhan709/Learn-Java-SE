package TypeConversionPackage;

/**
 * Convert String type variable into int
 */

public class StringToInt {
    public static void main(String[] args) {
        String str="23";
        int num1=Integer.parseInt(str);
        int num2=Integer.valueOf(str);
        System.out.println(num1);
        System.out.println(num2);
    }
}
