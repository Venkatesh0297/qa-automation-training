package week5_methods_arrays;

import java.util.Scanner;

public class ReverseArray {

    // Method to reverse an array
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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

        reverse(arr);

        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

