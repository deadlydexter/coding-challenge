# TDD: Test Driven Development for PrimeNumberGenerator

  - Write tests --> test fails --> write code --> test passes --> refactor --> repeat.
  - In this scenario, we write unit tests to test the methods generate() and isPrime().
  - Test fails --> 
  - we implement the interface PrimeNumberInterface in a class PrimeNumberList and override the methods generate() and isPrime()
  - check the tests again and if fails, refacor.

# Development: 
<strong>PrimeNumberInterface:</strong>
An interface in the Java programming language is an abstract type that is used to specify a behavior that classes must implement and an interface cannot be instantiated.
  - This interface has two methods:
  - ```List<Integer> generate(int startingValue, int endingValue);```
  - The above line suggests, return type is a List and the method accepts two input arguments, startingValue and EndingValue
  - I have implemented this interface in a seperate class called ```PrimeNumberList```

<strong>PrimeNumberList class:</strong>
  - Method: generate() is a straight forward method, which initializes a List and generates a list of all prime from the range using the method isPrime()
  - Method: isPrime() return true if input is prime and returns false when input is true.
  
<strong>PrimeNumberGenerator class: </strong>
  - This is the class that contains the main method, which has a method implemented to get the input from the user during program runtime.
  - ``` getUserInput() ``` this is the method that serves for two purpose to get both the starting and ending value from the user during program runtime 
Some features of ```getUserInput()``` method includes :
  - This method ensures that the user cannot enter a negative value as startingValue or EndingValue:
    - when entered, provides user with an oppurtunity to correct by entering Y - to try Again and N to exit
  - A user cannot enter null value
  - A user can enter the range of values in any order i.e., ```1 to 10``` or ```10 to 1```, an if loop handles this logic.
  
 # Unit Test:
  - Written unit tests to test the methods generate() and isPrime()
  - Tests are written using JUnit 
 Output: Test Coverege is 100%
 Program Execution: 
  - clone and import porject as Existing Maven project
  - Navigate to PrimeNumberGeneraor class which has the main method
  - right click and run as Java application
  
  
  # Command Line Execution: 
  
  <strong>Positive Scenario:</strong>
  user enters valid startingValue and EndingValue
  user gets back the list of Prime Numbers printed on the console:
  
  ```
  Please enter a positive StartingValue  value:
1
Please enter a positive EndingValue  value:
10
Starting Value = 1
Ending Value = 10
The PRIME numbers between 1 and 10 (inclusive) are:
2
3
5
7
Program executed !!!
```
<strong>Positive Scenario Two:</strong>
  user enters valid startingValue and EndingValue in reverse order
  user gets back the list of Prime Numbers printed on the console:
  ```
  Please enter a positive StartingValue  value:
20
Please enter a positive EndingValue  value:
10
Starting Value = 10
Ending Value = 20
The PRIME numbers between 10 and 20 (inclusive) are:
11
13
17
19
Program executed !!! 
```
<strong>Positive Scenario Three:</strong>
  user enters invalid startingValue first time and valid the second time and EndingValue 
  user gets back the list of Prime Numbers printed on the console:


```
    Please enter a positive StartingValue  value:
    -1
    StartingValue value cannot be negative
    Enter Y to try again. Enter N to exit.
    Y
    Please enter a positive StartingValue  value:
    10
    Please enter a positive EndingValue  value:
    15
    Starting Value = 10
    Ending Value = 15
    The PRIME numbers between 10 and 15 (inclusive) are:
    11
    13
    Program executed !!!
  ```
<strong>Positive Scenario Four:</strong>
  user enters valid startingValue and invalid EndingValue first time and valid the second time 
  user gets back the list of Prime Numbers printed on the console:


```
Please enter a positive StartingValue  value:
1
Please enter a positive EndingValue  value:
-5
EndingValue value cannot be negative
Enter Y to try again. Enter N to exit.
Y
Please enter a positive EndingValue  value:
16
Starting Value = 1
Ending Value = 16
The PRIME numbers between 1 and 16 (inclusive) are:
2
3
5
7
11
13
Program executed !!!
  ```
<strong>Positive Scenario Five:</strong>
  user enters null value for startingValue and valid value next time and a valid value EndingValue 
  user gets back the list of Prime Numbers printed on the console:


```
Please enter a positive StartingValue  value:

StartingValue Value cannot be Null
Enter Y to try again. Enter N to exit.
Y
Please enter a positive StartingValue  value:
1
Please enter a positive EndingValue  value:
10
Starting Value = 1
Ending Value = 10
The PRIME numbers between 1 and 10 (inclusive) are:
2
3
5
7
Program executed !!!
  ```
