package ArraysPackage;

import java.util.Arrays;

// How we can search from Array by using loop.

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 3, 5, 6, 9, 8, 11, 10 };
        Arrays.sort(arr);
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean check = ArrayCheck.search(arr, n);
        if (check == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();

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
