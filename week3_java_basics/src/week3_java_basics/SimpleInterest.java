package week3_java_basics;

public class SimpleInterest {
    public static void main(String[] args) {
        // Variables for principal, rate, and time
        double principal = 10000;   // Amount
        double rate = 5;           // Interest rate in %
        double time = 2;           // Time in years

        // Formula: (P * R * T) / 100
        double interest = (principal * rate * time) / 100;

        // Display results
        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time (years): " + time);
        System.out.println("Simple Interest = " + interest);
    }
}

