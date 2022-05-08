package TypeConversionPackage;

import java.util.Arrays;

/**
 * Java Program to Convert String to char array
 */

public class StringToCharArray {
    public static void main(String[] args) {
        String str="Sufyan Khan";
        char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
    }
}
