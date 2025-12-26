package project_euler.question7;
//What is the 10001 st prime number?
import java.util.ArrayList;

public class Question7 {
    // bir arraylist oluştur prime numberların olduğu
    // daha sonasında bulduğun prime numberları by arrayliste koy
    // ne zaman arrayin büyüklüğü 10000 olursa o zaman 10001. prime numberı bulmuş olursun

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        int number =2;

        while(primes.size() < 10001){
            if(isPrime(number)){
                primes.add(number);

            }
            number++;
        }
        System.out.println(primes.get(10000));

    }
    public static boolean isPrime(int n){
        if(n < 2 ) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }




}
