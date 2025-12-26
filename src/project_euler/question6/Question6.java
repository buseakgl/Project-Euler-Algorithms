package project_euler.question6;

public class Question6 {
    public static void main(String[] args) {
        // karelerin toplamı ve toplamın karesi arasındaki fark ilk yüz için
        // karesini al ve topla
        // toplamı bul ve karesini al
        // en son çıktıya fark = 1. - 2.
        long sum = 0;
        long sumOfPows = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfPows += Math.pow(i, 2);
            sum += i;
        }
        System.out.println(sum * sum - sumOfPows);
    }
}