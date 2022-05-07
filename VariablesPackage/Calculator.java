package VariablesPackage;

/**
 * 
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
 */

import java.util.Scanner;
public class Calculator {
         public static void main(String[] args) {
          int a,b,c;
          char op;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter 1st value:");
          a=sc.nextInt();
          System.out.println("Enter 2nd value:");
          b=sc.nextInt();
          System.out.println("Enter any operator:");
          op=sc.next().charAt(0);
          if(op=='+'){
            c=a+b;
            System.out.println(c);
          }
          else if(op=='-'){
            c=a-b;
            System.out.println(c);
          }
          else if(op=='*'){
            c=a*b;
            System.out.println(c);
          }
          else if(op=='/'){
            c=a/b;
            System.out.println(c);
          }
          else if(op=='%'){
            c=a%b;
            System.out.println(c);
          }
          else{
            System.out.println("Invalid operator");
          }
          sc.close();
        }
    }

