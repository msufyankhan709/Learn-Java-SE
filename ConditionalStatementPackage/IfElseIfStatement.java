package ConditionalStatementPackage;

import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value: ");
        x=sc.nextInt();
        if (x>=90&&x<=100) {
            System.out.println("Congratulation! You are passed and your grade is A+.");
        } else if (x>=80&&x<=90) {
            System.out.println("Congratulation! You are passed and your grade is A.");
        }
        else if (x>=70&&x<=80) {
            System.out.println("Congratulation! You are passed and your grade is B.");
        }
        else if (x>=60&&x<=70) {
            System.out.println("Congratulation! You are passed and your grade is C.");
        }
        else if (x>=50&&x<=60) {
            System.out.println("Congratulation! You are passed and your grade is D.");
        }
        else if (x>=33&&x<=50) {
            System.out.println("Congratulation! You are passed.");
        }
        else if (x<=32) {
            System.out.println("You are fail.");
        }
        else{
            System.out.println("Invalid number");
        }
        sc.close();
    }
}
