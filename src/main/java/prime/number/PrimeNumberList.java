package prime.number;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberList implements PrimeNumberInterface
{

    // Creates a list of prime numbers
    // Method Arguments: start and end values of series

    @Override
    public List<Integer> generate(int startingValue, int endingValue)
    {

        List<Integer> list = new ArrayList<>();

        for (int i = startingValue; i <= endingValue; i++) {

            if (isPrime(i)) {
                list.add(i);
            }
        }
        // Return the list of prime numbers
        return list;
    }

    // Check if Prime
    @Override
    public boolean isPrime(int value)
    {

        if (value ==0 || value == 1) {
            return false;
        }

        else if (value <= 3) {
            return true;
        }

        // Numbers that are multiples of 2 and 3 are not prime
        else if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }

        else {
            //   Primality test using 6k+-1 optimization
            for (int i = 5; i * i <= value; i = i + 6) {
                if (value % i == 0 || value % (i + 2) == 0) {
                    return false;
                }
            }
        }

        return true;
    }

}
