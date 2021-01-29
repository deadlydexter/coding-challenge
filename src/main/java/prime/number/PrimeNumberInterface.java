package prime.number;

import java.util.List;

interface PrimeNumberInterface {

    //    Generates a list of prime numbers 
    List<Integer> generate(int startingValue, int endingValue);

    //    Returns true if prime and false if not a prime 
    boolean isPrime(int value);
    
}