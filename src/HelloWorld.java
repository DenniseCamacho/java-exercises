public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Word");


      /**1  Create an int variable named myFavoriteNumber and assign your favorite number to it,
       * then print it out to the console.**/
        int myFavoriteNumber = 7;
        System.out.println("My favorite number is: " + myFavoriteNumber);
       /**2 Create a String variable named myString and assign a string value to it,
        *  then print the variable out to the console.**/
       String myString = "The best things in life are not things...";
        System.out.println(myString);
       /**3 Change your code to assign a character value to myString. What do you notice?**/
        // char myString; //error...
        // myString = 'c';//error java: incompatible types: char cannot be converted to java.lang.String
       /**4 Change your code to assign the value 3.14159 to myString. What happens?**/
        //myString = 3.14159; //java: incompatible types: double cannot be converted to java.lang.String
       /**5 Declare a long variable named myNumber, but do not assign anything to it.
        *  Next try to print out myNumber to the console. What happens?**/
//                long myNumber;
        //System.out.println("what happens: " + myNumber); //java: variable myNumber might not have been initialized
       /**6 Change your code to assign the value 3.14 to myNumber. What do you notice?**/
        //        long myNumber = 3.14; //java: incompatible types: possible lossy conversion from double to long
        /**7 Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.**/
//        long myNumber = 123L;
//        System.out.println("This number is long: " + myNumber);

        /**8 Change your code to assign the value 123 to myNumber.**/
        long myNumber = 123;
        System.out.println("This number has no L but prints? " + myNumber);
        /** Why does assigning the value 3.14 to a variable declared as a long not compile,
         * but assigning an integer value does?**/
            //a one digit decimal is not a long number? I am not entirely sure.

         /**9 Change your code to declare myNumber as a float. Assign the value 3.14 to it.
          *  What happens? What are two ways we could fix this?**/


         /**10 Copy and paste the following code blocks one at a time and execute them**/
                //int x = 5;               -   //int x = 5;
               //System.out.println(x++);  -  //System.out.println(++x);
              //System.out.println(x);     -  //System.out.println(x);
        /**What is the difference between the above code blocks? Explain why the code outputs what it does.**/

        /**Try to create a variable named class. What happens?**/

//        Object var;
//        var class = 21;

        /**        Object is the most generic type in Java. You can assign any value to a variable of type Object.
         * What do you think will happen when the following code is run?
        **/

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//                How is the above example different from the code block below?
//
//
//        int three = (int) "three";
//        What are the two different types of errors we are observing?
//
//                Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
//        int x = 4;
//        x = x + 5;
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.





    }
}
