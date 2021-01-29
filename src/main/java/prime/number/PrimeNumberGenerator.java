package prime.number;

import java.util.List;
import java.util.Scanner;

public class PrimeNumberGenerator
{

    public static void main(String[] args)
    {

        int min, max;

        int value_1 = getUserInput("StartingValue");

        int value_2 = getUserInput("EndingValue");
        
        // Loop to assign min and max value
        if (value_1 < value_2) {
            min = value_1;
            max = value_2;
        } else {
            min = value_2;
            max = value_1;
        }
        
        System.out.println("Starting Value = " + min);
        System.out.println("Ending Value = " + max);

        PrimeNumberInterface p = new PrimeNumberList();
        List<Integer> finalList;

        // Generate Prime Numbers using the implemented method
        finalList = p.generate(min, max);

        if (finalList.isEmpty()) {
            System.out.println("There are no prime numbers " + "between " + min + " and " + max + ".");
        } else if (finalList.size() == 1) {
            System.out.println("The PRIME number between " + min + " and " + max + " (inclusive) is:");
            finalList.forEach(System.out::println);
        } else {
            System.out.println("The PRIME numbers between " + min + " and " + max + " (inclusive) are:");
            finalList.forEach(System.out::println);
        }
        System.out.println("Program executed !!!");

    }

    public static int getUserInput(String test)
    {
        String flag = "Y";

        Scanner input = new Scanner(System.in);

        int startingValue = 0;
        while (flag.equals("Y")) {

            try {
                System.out.println("Please enter a positive " + test + "  value:");
                startingValue = Integer.parseInt(input.nextLine());

                // User can enter only positive values
                if (startingValue < 0) {
                    System.out.println(test+" value cannot be negative");
                    throw new IllegalArgumentException("value must be positive");
                }
                if (startingValue >= 0) {
                    flag = "N";
                }

            } catch (NumberFormatException e) {
                System.out.println(test +" Value cannot be Null");

                // Type Y to Re-try or N to Exit: 
                System.out.println("Enter Y to try again. Enter N to exit.");
                String tryAgain = input.nextLine();
                if (!flag.equals(tryAgain)) {
                    System.exit(0);
                }

            } catch (IllegalArgumentException e) {
                // Type Y to Re-try or N to Exit: 
                System.out.println("Enter Y to try again. Enter N to exit.");
                String tryAgain = input.nextLine();
                if (!flag.equals(tryAgain)) {
                    System.exit(0);
                }
            }

        }

        return startingValue;
    }
}
