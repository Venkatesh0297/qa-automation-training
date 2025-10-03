package week3_java_basics;

public class SwapNumbers {
    public static void main(String[] args) {
        // Initialize two numbers
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap without third variable
        a = a + b; // Step 1
        b = a - b; // Step 2
        a = a - b; // Step 3

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
