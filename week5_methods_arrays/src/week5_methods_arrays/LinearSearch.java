package week5_methods_arrays;

import java.util.Scanner;

public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int result = linearSearch(arr, key);

        if (result == -1)
            System.out.println(key + " not found in the array.");
        else
            System.out.println(key + " found at index: " + result);

        sc.close();
    }
}
