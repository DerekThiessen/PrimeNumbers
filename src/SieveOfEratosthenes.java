import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes implements PrimeNumberGenerator {

    private boolean[] primes;

    public List<Integer> generate(int startingValue, int endingValue) {

        int number = endingValue >= startingValue ? endingValue : startingValue;

        primes = new boolean[number + 1];

        for(int i = 0; i <= number; i++) {
            primes[i] = true;
        }

        for(int p = 2; p * p <= number; p++){
            if(isPrime(p)){
                for(int i = p * 2; i <= number; i += p){
                    primes[i] = false;
                }
            }
        }

        if(startingValue > endingValue){
            return createInverseRange(startingValue, endingValue);
        }

        return createRange(startingValue, endingValue);

    }

    private List<Integer>  createRange(int startingValue, int endingValue) {
        List<Integer> primeNumbers = new ArrayList<Integer>();

        for(int i = 2; i <= endingValue; i ++){
            if(i >= startingValue && i <= endingValue && isPrime(i)){
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    private List<Integer>  createInverseRange(int startingValue, int endingValue) {
        List<Integer> primeNumbers = new ArrayList<Integer>();

        for(int i = 2; i <= startingValue; i++){
            if(i <= startingValue && i >= endingValue && isPrime(i)){
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    public boolean isPrime(int value) {
        return primes[value] == true;
    }
}
