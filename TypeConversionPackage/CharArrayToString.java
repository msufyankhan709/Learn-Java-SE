package TypeConversionPackage;

/**
 * 
 * Java Program to Convert Character Array to String
 */

public class CharArrayToString {
    public static void main(String[] args) {
        char[] ch= {'A','E','I','O','U'};
        String name=String.valueOf(ch);
        String name2=new String(ch);
        System.out.println(name+" "+name2);
    }
}
