package ConditionalStatementPackage;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value: ");
        a=sc.nextInt();
        if (a>=33&&a<=100) {
            System.out.println("Congratulation! You are passed");
        } else {
            System.out.println("You are fail.");
        }
        sc.close();
    }
}
