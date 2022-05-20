package InterfacePackage;

interface testing2{
    int a=10;
 public void run();
}

class check implements testing2{
    @Override
    public void run() {
        System.out.println("Interface is running");
    }
}

public class Testing{
    public static void main(String[] args) {
        check myObj=new check();
        myObj.run();
    }
}
