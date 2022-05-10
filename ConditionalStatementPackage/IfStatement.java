package ConditionalStatementPackage;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
       int a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any value: ");
       a=sc.nextInt();
       if(a>33&&a<100)
       System.out.println("Congratulation! You are passed."); 
       sc.close();
    }
}
