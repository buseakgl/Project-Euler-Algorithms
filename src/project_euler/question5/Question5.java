package project_euler.question5;

public class Question5 {
    public static void main(String[] args) {
        // ekok bulacağız. 1 den 20 ye kadar olan sayıların hepsine bölünmeli
        int lcm = 1;
        for (int i = 2; i <= 20; i++) {
            // asal sayı olduğunu doğrulamamız lazım
            boolean prime = true;
            for (int a = 2; a <= i - 1; a++) {
                // sayının böleninden asal mı değil mi anlamaya çalışıyoruz
                if (i % a == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                // kuvvetini buluyoruz
                int temp = i;
                while (temp * i <= 20) {
                    temp = temp * i;
                }
                lcm = lcm * temp;
            }
        }
        System.out.println(lcm);
    }
}