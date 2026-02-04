package project_euler.question10;
//Find the sum of all the primes below two million.
public class Question10 {
    public static void main(String[] args){
        long sum = 0;
        for (int i = 2; i < 2000000; i++) { // 2 milyona kadar olan sayıların asal mı olduğunu bulacağız
            boolean isPrime = true;
            
            for (int v = 2; v * v <= i; v++) {
                if (i % v == 0) { // her hangi bir bölen bulursak asal değil dur
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
