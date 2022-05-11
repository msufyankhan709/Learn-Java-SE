package ConditionalStatementPackage;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        int a=sc.nextInt();
        int result=(x>a)?x:a;
        System.out.println(result);
        sc.close();
    }
}
