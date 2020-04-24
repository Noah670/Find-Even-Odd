/*
* FindEvenOdd allows the user to enter a number which will then display 
* all the possible Even and Odd values contained within the number and in reverse order
*
* @author Noah670
* @version 1.0
* @since 2020-04-25
*/

import java.util.Scanner;

public class FindEvenOdd {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Find all the odd and even values for any number.");
    System.out.println("Please enter a number");

    int number = input.nextInt();

    System.out.println("even numbers:");
    for (int i = 0; i <= number; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }

    }

    System.out.println();

    System.out.println("Even numbers in reverse");
    for (int i = number; i >= 0; i--) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }

    System.out.println();

    System.out.println("odd numbers: ");
    for (int i = 0; i <= number; i++) {
      if (i % 2 == 1) {
        System.out.print(i + " ");
      }
    }

    System.out.println();

    System.out.println("Odd numbers in reverse");
    for (int i = number; i >= 0; i--) {
      if (i % 2 == 1) {
        System.out.print(i + " ");
      }
    }

  }
}