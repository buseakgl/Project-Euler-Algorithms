package project_euler.question2;

/*
 * Project Euler - Question 2
 * Calculation of the sum of even Fibonacci numbers up to 4 million.
 */
public class Question2 {
    public static void main(String[] args) {
        // Keeping your exact logic and variable names:
        int a = 1;
        int b = 1;
        int c = 0;
        int sum = 0;

        // while loop to calculate Fibonacci sequence
        while (c <= 4000000) {
            a = b;
            b = c;
            c = a + b;

            // Check if the number is even using the modulo operator
            if (c % 2 == 0) {
                sum += c;
            }
        }

        // Output the final result: 4613732
        System.out.println("The sum of even Fibonacci numbers: " + sum);
    }
}