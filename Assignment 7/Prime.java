import java.util.LinkedList;

public class Prime {
    LinkedList <Integer> primes = new LinkedList<>() ;
    public Prime(int max){
        boolean[] isPrime = new boolean[max + 1];
        for(int i = 2; i <= max; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i * i <= max; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= max; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i <= max; i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
    }

    public boolean isPrime(int number){
        for(int prime : primes){
            if(prime == number){
                return true;
            }
        }
        return false;
    }

    public int getPrime(int position){
        return primes.get(position);
    }
}
