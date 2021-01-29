package prime.number;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


import static org.junit.Assert.*;

public class PrimeNumberListTest {
    
    // Method: generate() Test
    @Test
    public void testGenerate() {
        System.out.println("Running Unit Tests");
        PrimeNumberList instance = new PrimeNumberList();
        
        //  prime numbers between 1 and 20
        List<Integer> testListOne = new ArrayList<>();
            testListOne.add(2); testListOne.add(3); testListOne.add(5);
            testListOne.add(7); testListOne.add(11); testListOne.add(13);
            testListOne.add(17); testListOne.add(19); 
        
        //prime numbers between 50 and 100
        List<Integer> testListTwo = new ArrayList<>();
            testListTwo.add(53); testListTwo.add(59); testListTwo.add(61);
            testListTwo.add(67); testListTwo.add(71); testListTwo.add(73);
            testListTwo.add(79); testListTwo.add(83); testListTwo.add(89);
            testListTwo.add(97); 
            
           // prime numbers between 7900 and 7920
            List<Integer> testListThree = new ArrayList<>();
                testListThree.add(7901); testListThree.add(7907); testListThree.add(7919);
                
        // Test lists used to compare against expected lists
       
        List<Integer> resultOne = instance.generate(1, 20);
        List<Integer> resultTwo = instance.generate(50, 100);
        List<Integer> resultThree = instance.generate(7900, 7920);
        
        // Compares the list results (they should be identical lists)

        assertEquals(testListOne, resultOne);
        assertEquals(testListTwo, resultTwo);
        assertEquals(testListThree,resultThree );
    }
    
    // Method: isPrime() Test
    @Test
    public void testIsPrime() {
        System.out.println("Testing Method: isPrime()");
        PrimeNumberList instance = new PrimeNumberList();
        
        assertEquals(false, instance.isPrime(1));
        assertEquals(true, instance.isPrime(2));
        assertEquals(true, instance.isPrime(3));
        assertEquals(true, instance.isPrime(5));
        assertEquals(false, instance.isPrime(111));
        assertEquals(true, instance.isPrime(7907));
    }
    

    
}