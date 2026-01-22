package project_euler.question9;

public class Question9 {
    public static void main(String[] args) {
        int c;
        int multiply = 0;
        for (int a = 1; a < 1000; a++) {
            for (int b = a; b < 1000; b++) {
                c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    multiply = a * b * c;
                    System.out.println(multiply);
                    return;
                }
            }
        }
    }
}