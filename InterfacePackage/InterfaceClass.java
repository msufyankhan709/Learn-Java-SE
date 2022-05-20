package InterfacePackage;

import java.util.Scanner;

interface test{
    int a=45;
    void sum(int a, int b);
    default void test4(){
        System.out.println("Hello Sufyan");
    }
}

class test5 implements test{
    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
    @Override
    public void test4() {
        test.super.test4();
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        test5 myObj=new test5();
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        myObj.sum(c,d);
        myObj.test4();
        sc.close();
    }
}