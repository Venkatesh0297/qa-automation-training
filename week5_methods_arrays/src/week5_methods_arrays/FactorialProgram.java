package week5_methods_arrays;

import java.util.Scanner;

public class FactorialProgram {

    // Method to calculate factorial
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        sc.close();
    }
}

