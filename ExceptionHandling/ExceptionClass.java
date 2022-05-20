package ExceptionHandling;

public class ExceptionClass {
    public static void main(String[] args) {
        int a=10, b=0;
        try {
            int c=a/b;
            System.out.println("The program is executed successfully and answer is: "+ c);
        } catch (Exception e) {
            System.out.println("There is error");
            System.out.println("And error is "+ e);
        }
    }
}
