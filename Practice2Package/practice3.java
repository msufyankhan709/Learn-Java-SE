package Practice2Package;
import practicePackage.practice;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        practice myObj=new practice();
        myObj.setAge(15);
        myObj.getAge();
        System.out.println(myObj.getAge());
        System.out.println(Math.max(9, 7));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        int c=sc.nextInt();
        System.out.println("Enter 2nd value: ");
        int d=sc.nextInt();
        System.out.println(add(c,d));
    }
    public static int add(int a, int b){
     return a+b;
    }
}
