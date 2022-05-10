package ConditionalStatementPackage;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        char x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        x = sc.next().charAt(0);
        switch (x) {
            case 'a':
                System.out.println("It is a Vowel value");
                break;
            case 'A':
                System.out.println("It is a Vowel value");
                break;
            case 'e':
                System.out.println("It is a Vowel value");
                break;
            case 'E':
                System.out.println("It is a Vowel value");
                break;
            case 'i':
                System.out.println("It is a Vowel value");
                break;
            case 'I':
                System.out.println("It is a Vowel value");
                break;
            case 'o':
                System.out.println("It is a Vowel value");
                break;
            case 'O':
                System.out.println("It is a Vowel value");
                break;
            case 'u':
                System.out.println("It is a Vowel value");
                break;
            case 'U':
                System.out.println("It is a Vowel value");
                break;
            default:
                System.out.println("Consonant value");
                break;
        }
        sc.close();
    }
}
