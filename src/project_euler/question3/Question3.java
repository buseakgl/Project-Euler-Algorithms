package project_euler.question3;

/*
 * Project Euler - Question 3
 * Goal: Find the largest prime factor of a given large number.
 */
public class Question3 {
    public static void main(String[] args) {
        // Using your exact logic and variables:
        long n = 600851475143L;
        int i = 2;

        // The loop continues as long as i * i is less than or equal to n
        while (i * i <= n) {
            if (n % i == 0) {
                // If n is divisible by i, divide n by i and keep i the same
                n = n / i;
            } else {
                // If not divisible, increment i to check the next number
                i++;
            }
        }

        // After the loop, the remaining n is the largest prime factor
        // Output the final result: 6857
        System.out.println("The largest prime factor is: " + n);
    }
}