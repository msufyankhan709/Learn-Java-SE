package LoopsPackage;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        while (i<=10) {
            System.out.println("Hello everyone");
            i++;
        }
        sc.close();
    }
}
