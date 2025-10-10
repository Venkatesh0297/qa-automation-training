package week4_java_controlflow;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n = 10; // number of terms
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
