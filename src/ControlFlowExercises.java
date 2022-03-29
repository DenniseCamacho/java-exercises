import java.lang.Math;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.
//
//                Loop Basics
//
//        While
//
//       TODO: Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15
/**
        int i = 5;
        while (i <= 15){
            System.out.println("i is " + i);
            i++;
        }
         **/

//        Do While
//
        //TODO:Create a do-while loop that will count by
        // 2's starting with 0 and ending at 100.
/**
        int i2 = 0;
        while (i2 <= 50){
            System.out.println("By two's: " + i2 * 2);
            i2++;
        }
 **/

        //TODO:Follow each number with a new line.
        //TODO:Alter your loop to count backwards by 5's from 100 to -10
/**        int i3 = 20;
        while (i3 >= -2){
            System.out.println("backwards by 5's from 100 to -10 :" + i3 * 5);
            i3--;
        }
 **/

        //TODO:Create a do-while loop that starts at 2,
        // and displays the number squared on each line
        // while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

        //TODO: Clarification on what is going wrong here and why 2 is not showing up.
        /**
      long intnum = 2;
        do{
            System.out.println(intnum = intnum * intnum);
        }while(intnum >= 2  && intnum < 10000);
        **/
        //NOT SURE HOW TO START AT 2.
//
//        Refactor the previous two exercises to use a for loop instead.
         /**  for (int i = 20; i >= -2; i--) {
            System.out.println("backwards by 5's from 100 to -10: " + i * 5);
        } **/

        //TODO: Clarification on what is going wrong here.
        /**
        for (long i = 2; i < 10000; i++) {
           if (i >= 2  && i < 10000) {
               System.out.printf("%d %n",i);
           }
        }
         **/
/**
                for (long i = 1; i <= 100; i++) {
             if (i % 2 == 0) {
                 System.out.println(i);
             }
         }
**/

        //NOT SURE HOW TO CHECK WHAT IS GOING WRONG.


//        Fizzbuzz
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//            TODO:    Write a program that prints the numbers from 1 to 100.
 /**       for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
  **/
//       TODO: For multiples of three: print “Fizz” instead of the number.
 /**       for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
  **/
//      TODO:  For the multiples of five: print “Buzz”.
/**        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
 **/
//       TODO: For numbers which are multiples of both three and five: print “FizzBuzz”.
  /**      for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
   **/


//        Display a table of powers.
//               TODO: Prompt the user to enter an integer.
 /**       //1.make the scanner...
        Scanner sc = new Scanner(System.in);
        //2.now you can get users input.
        System.out.println("Please enter a number: ");
        int usersNumber = sc.nextInt();
//     TODO:   Display a table of squares and cubes from 1 to the value entered.
        long usersNumberSquared = usersNumber * usersNumber;
        long usersNumberCubed = usersNumber * usersNumber * usersNumber;
        for (int i = 1; i < usersNumber; i++) {
            System.out.printf("%d squared is: " + usersNumberSquared, usersNumber);
        }

  **/
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//


    }
}
