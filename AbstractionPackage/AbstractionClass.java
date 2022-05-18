package AbstractionPackage;

abstract class test{
  abstract void testing();
}

class AbstractionClass2 extends test{
    @Override
    void testing() {
        System.out.println("Hello World");
    }
}
public class AbstractionClass{
  public static void main(String[] args) {
      AbstractionClass2 myObj=new AbstractionClass2();
      myObj.testing();
  }
}
