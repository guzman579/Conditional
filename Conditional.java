// Conditional.java

import java.util.Scanner;

public class Conditional
{
   // main method begins execution 
   public static void main(String[] args)
   {
      // create Scanner to obtain input from command line
      Scanner input = new Scanner(System.in);

      int number1; // first number to compare
      int number2; // second number to compare

      System.out.print("Enter first integer: "); // prompt 
      number1 = input.nextInt(); // read first number  

      System.out.print("Enter second integer: "); // prompt 
      number2 = input.nextInt(); // read second number 
      
      if (number1 == number2) 
         System.out.printf("%d == %d%n", number1, number2);

      if (number1 != number2)
         System.out.printf("%d != %d%n", number1, number2);

      if (number1 < number2)
         System.out.printf("%d < %d%n", number1, number2);

      if (number1 > number2)
         System.out.printf("%d > %d%n", number1, number2);

      if (number1 <= number2)
         System.out.printf("%d <= %d%n", number1, number2);

      if (number1 >= number2)
         System.out.printf("%d >= %d%n", number1, number2);
   } // end main
} // end class 
