package project_euler.question4;

/*
 * Project Euler - Question 4
 * Goal: Find the largest palindrome product of two 3-digit numbers.
 */
public class Question4 {
    public static void main(String[] args) {
        int maxPalindrome = 0;

        // Nested loops to multiply all combinations of 3-digit numbers
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                // 'product' replaces 'carpim'
                int product = i * j;

                // Convert integer to String to check the sequence
                // 'originalStr' replaces 'palindromMu'
                String originalStr = Integer.toString(product);
                String reversedStr = "";

                // Logic to reverse the string
                for (int a = 0; a < originalStr.length(); a++) {
                    reversedStr = originalStr.charAt(a) + reversedStr;
                }

                // Check if the string matches its reverse and update max
                if (originalStr.equals(reversedStr) && product > maxPalindrome) {
                    maxPalindrome = product;
                }
            }
        }

        // Output the final result: 906609
        System.out.println("The largest palindrome product is: " + maxPalindrome);
    }
}