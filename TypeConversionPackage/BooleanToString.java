package TypeConversionPackage;

/**
 * Java Program to convert boolean variables into string
 */

public class BooleanToString {
    public static void main(String[] args) {
        Boolean married=false;
        Boolean notMarried=true;
        String str2=Boolean.toString(notMarried);
        System.out.println(str2);
        String str=String.valueOf(married);
        System.out.println(str);
    }
}
