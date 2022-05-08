package TypeConversionPackage;

/**
 * Java Program to convert string variables to double
 */

public class StringToDouble {
    public static void main(String[] args) {
        String str="20";
        double xyz=Double.valueOf(str);
        double abc=Double.parseDouble(str);
        System.out.println(xyz);
        System.out.println(abc);
    }   
}
