package ArrayListPackages;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<String> arr=new ArrayList<String>();
        arr.add("Sufyan");
        arr.add("Bilal");
        arr.add("Numan");
        arr.add("Zeeshan");
        Collections.sort(arr);
        System.out.println(arr);
        List<Integer> arr2=new ArrayList<Integer>();
        arr2.add(10);
        arr2.add(13);
        arr2.add(30);
        arr2.add(7);
        Collections.sort(arr2);
        System.out.println(arr2);
    }
}
