package VariablesPackage;

/**
 * 
 *  Write a Java program that takes two numbers as input and display the product of two numbers.
 */

import java.util.Scanner;
public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a=sc.nextInt();
        System.out.println("Enter first value: ");
        int b=sc.nextInt();
        System.out.println("Product= "+ a*b);
        sc.close();
    }
}
