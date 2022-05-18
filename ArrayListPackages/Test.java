package ArrayListPackages;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mehran");
        cars.add("Corolla");
        System.out.println(cars);
        cars.remove(1);
        cars.set(0, "Testing");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
    }
}
