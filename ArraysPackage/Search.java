package ArraysPackage;

// How we can search from Array by using loop.

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean check = ArrayCheck.search(arr, n);
        if (check == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class ArrayCheck {
    public static boolean search(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
