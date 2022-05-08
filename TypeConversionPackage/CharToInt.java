package TypeConversionPackage;

/**
 * Java Program to convert char type variables to int
 */

public class CharToInt {
    public static void main(String[] args) {
        char ch='2';
        int in=Character.getNumericValue(ch);
        int inn=ch-'0';
        int test=Integer.parseInt(String.valueOf(ch));
        System.out.println(in);
        System.out.println(inn);
        System.out.println(test);
    }
}
