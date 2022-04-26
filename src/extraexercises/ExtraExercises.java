package extraexercises;


public class ExtraExercises {
    public ExtraExercises(){}
    //1. Create a method, `getType()` that will take in an input and return a string
    ////        describing the type of the value. Account for int, boolean, String, char, and
////        double. Use method overloading.
    public static String getType(Object input) {
        return "this is a(n) : " + input.getClass().getName();
    }
    public static String getType(int input){
        return "this is in the int method";
    }
    public static String getType(boolean input){
        return "this is in the boolean method";
    }
    public static String getType(String input){
        return "this is in the String method";
    }
    public static String getType(char input){
        return "this is in the char method";
    }
    public static String getType(double input){
        return "this is a(n) : " + input;
    }

    //2. Create a method that will return how many capital letters are in a string.
    public static int howManyCapitals(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
//            System.out.println(Character.isUpperCase(word.charAt(i)));
            if (Character.isUpperCase(word.charAt(i))){
                count++;
            }
            }
        System.out.printf("Your uppercase count is: ");
        return count;
    }


    //3.Create a vowel counting method for each vowel in the alphabet (not including Y)
    //Each method, when passed a string, should return how many of that vowel
    // is in the string. Given a string, use all the vowel counting methods
    //to output the count of each vowel in a word.
//    The `countVowels` method uses the following methods to produce it's output:
//        - `countAs()` ???
//        - `countEs()` ???
//        - `countIs()` ???
//        - `countOs()` ???
//        - `countUs()` ??? //create a bunch of functions and make the function use them.
    public static String countVowels(String word){
        word = word.toLowerCase();
        String banner = "|======== VOWEL COUNT ========|";
        String banner2 = "| A's | E's | I's | O's | U's |";
        String bannerEnd = "|=============================|";
        long countA = 0;
        long countE = 0;
        long countI = 0;
        long countO = 0;
        long countU = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)){
                case 'a':
                    countA++;
//                    System.out.println("this is a");
//                    System.out.println(Character.charCount(word.charAt(i)));
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
            }
//            (word.charAt(i) == 'a')
//            (word.charAt(i) == 'e')
//            (word.charAt(i) == 'i')
//            (word.charAt(i) == 'o')
//            (word.charAt(i) == 'u')
            }
        System.out.println(banner);
        System.out.println(banner2);
        System.out.printf(
                "| %d   | %d   | %d   | %d   | %d   |%n",
                countA, countE, countI, countO, countU
        );
        return bannerEnd;
        }
    ////        1. Create a method to print out every letter in a string using recursion.
    public static String everyLetter(String word){
        for (int i = 0; i < word.length(); i++) {

        }
        return word;
    }
    public static char everyLetter(){
      return ' ';
    }
////# Extra Methods Exercises
////        1. Create a method to determine if a string is a palindrome.
//a word, phrase, or sequence that reads the same backward as forward
    public static String palindrome(String word){
            return word;
    }
//        for (int i = 0; i < word.length(); i++) {
//        everyLetter(String.valueOf(word.charAt(i)));
//        }
        } //<-end of class.
////        1. Create a method that will convert a written out whole number from "zero" to
////        "ninety-nine" and return the actual number.
////
////        1. Create a command line calculator
////
////        - the user may enter a number
////        - the user may enter an operator
////        - the user may enter a second number
////        - the program should output a result, then prompt the user for another calculation
////
////        1. Build a time conversion application:
////
////        The user should be prompted which time to enter (12 hour or 24 hour time),
////        then the user should be able to enter a given time. The user should then see
////        the converted time (12 hour to 24 hour or 24 hour to 12 hour)
////
////        1. Time conversion (part 2)
////
////        Create a method which accepts dates in the following format:
////
////        mm/dd/yyyy
////
////        and returns a string with this format:
////
////        monthname, day, year
////
////        example:
////
////        input: 12/01/1999
////        output: December 12, 1999
////
////        1. Time conversion (part 3)
////
////        Lookup the `Date` class in Java and use it to rewrite your previous time
////        conversion applications.
////
////        1. Create a command line Hangman game:
////
////        The game should prompt player 1 for a word. Player 2 (p2) has 9 guesses to
////        correctly identify the word.
////
////        Each round, display to the user:
////
////        - The current visible letters of the word
////        - The letters already incorrectly guessed
////        - The number of guesses remaining
////
////        Further Specifications:
////
////        - At any round, the user may guess a letter or multiple letters to complete
////        the word
////        - If p2 guesses correctly, they WIN! and are asked if they want to play again
////        - If p2 guesses wrong, they LOSE!
////        - If p2 runs out of guesses, they LOSE!
////
////        1. Create date format converter application.
////
////        Take in the following format:
////
////        MM/DD/YYYY
////
////        Output the following:
////
////        MonthName DD, YYYY
////
////        Example:
////
////        input - `12/01/1999`
////        output - `December 12, 1999`
////
////        ---
////
////        1. Write a method named `firstChar()` that takes a string as an input and
////        returns the first letter as a character data type.
////        1. Write a method named `secondChar()` that takes a string as an input and
////        returns the first letter as a character data type.
////        1. Write a method named `lastChar()` that takes a string as an input and returns
////        the last letter as a character data type.
////        1. Write a method named `secondToLastChar()` that takes a string as an input and
////        returns the second to letter as a character data type.
////        1. Write a method named `userWantsToContinue()`. This method should prompt the
////        user if they want to continue and then return a boolean value if the user
////        inputs "y" or "yes".
////        1. Write a method named `isEven()` that takes in an integer and returns a
////        boolean if the input is even or not.
////        1. Write a method named `isOdd()` that takes in an integer and returns a boolean
////        if the input is odd or not.
////        1. Write a method named `countOdds(start, end)` that returns an integer
////        containing the integer that is the count of all odd numbers between the start
////        and the end input integers.
////        1. Write a method named `countEvens(start, end)` that returns an integer
////        containing the integer that is the count of all even numbers between the
////        start and the end input integers.
////        1. Write a method named `isVowel()` that accepts a String input of length 1 and
////        returns a boolean if that string is a vowel other than "y".
////        1. Write a method named `hasVowels()` that accepts a string of any length and
////        returns a boolean if there are any vowels in that string.
////        1. Write a method named `countVowels()` that accepts a string of any length and
////        returns an integer count of the number of vowels in the provided input
////        String.
////        1. Write a solution to FizzBuzz using recursion instead of a loop.
////        1. Write a method named `isPrime()` that that accepts in an integer number and
////        returns a boolean if the number is evenly divisible only by either 1 or the
////        number itself.
////        1. Write a method named `getTwentyPrimes()` that returns a string containing the
////        first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7,
////        11, 13, 17, 19"... until we have a total count of 20 primes in the string.
////
////        ---
////
////        1. Write a method called `coinFlip` that randomly returns a true or false value.
////        1. Write a method named `randomWalk` that takes in an integer and returns a
////        string of that many random ones and zeros. Example: `randomWalk(1)` returns a
////        string with one character that is randomly 0 or 1. `randomWalk(33)` returns a
////        string with 33 random 1s or 0s.
////        1. Write a method named `countOnes` that takes in a string of ones and zeroes
////        and returns a count of the ones.
////        1. Write a method named `countZeros` that takes in a string of ones and zeroes
////        and returns a count of the 0s.
////        1. Write a method named `analyzeRandomWalk` that accepts a string containing
////        ones and zeroes and prints out the number of ones and the number of zeroes.
////        This method is void because it does not return anything. Example:
////        analyzeRandomWalk("11000") should print "There are 2 ones and 3 zeroes".
////        1. Write a method named `longestRun` that accepts a string of ones and zeroes
////        and returns an integer that specifies the longest consecutive sequence of
////        either 0s or 1s. Example: `longestRun("1001111100")` returns 5 because there
////        are 5 ones in a row. `longestRun("01001")` returns 2 because there are two
////        consecitive zeroes.
////        1. Write a method named `secondLongestRun` that accepts a string of 1s and 0s
////        and returns an integer that specifies the length of the second longest run of
////        consecutive numbers. Example `secondLongestRun("111001")` returns 2 because
////        the two 0s in a row are the second longest run.
////        1. Write a method named `magic8ball` that prompts the user to input a question.
////        If the user inputs a string that does not have a question mark at the end,
////        then start the method over again. When answering the magic 8 ball randomly
////        returns one of a set of string options like the following:
////        - "All signs point to yes", "The future is cloudy. Ask again", "Very
////        doubtful", "Outlook not so good.", "Don't count on it.", "You may rely on
////        it!", "Ask again later."
////        1. Write a method named `dndDiceRoll` that accepts a string of the format "2d6"
////        where the first number(s) are the number of dice and the second number is the
////        number of sides of each of those dice. Example: "5d4" rolls a four sided die
////        5 times and returns the sum of the result.
////        1. Write a method named `l5rDiceRoll` that accepts a string of the following
////        format "6k4" where the first number is the number of dice to roll, the second
////        number is the number of dice we keep the highest values from, and each die
////        has 10 sides. Example "4k2" rolls 4 dice of 10 sides, and returns the sum of
////        the highest 2 rolls.
////
////        ---
////
////        ### Additional Practice
////
////        Consider revisiting previous exercises and bonuses to refactor to use methods. The string bonuses from the previous lesson would be a great exercise in refactoring to use methods.


//So, I was working on some things, and git pushes were not working.
// I searched google and realized my email was incorrect.
// going back and redoing work to understand.
//# Java Fundamentals
//
//        ## Main Concepts to be Assessed
//
//        - Object Oriented Programming
//        - Method Overriding and Method Overloading
//        - Arrays
//        - Inheritance and Polymorphism
//        - Interfaces
//        - Collections
//        - Exceptions and Error Handling
//
//        ## Currently not being assessed:
//        - Annotations like @SuppressWarnings or @Deprecated
//- Files I/O
//        - Abstract Classes
//        - Deployment and Dependencies
//        - Testing Code with JUnit
//
//        ## Java Fundamentals Checklist
//        The following are several points of competency and skill that are intended to help identify areas of additional practice and study. Not all answers are found in the Codeup curriculum.
//        ## Knowledge
//        ### Java I
//        - [ ] I can explain how Java code runs: from being written to executing on an operation system.
//        - [ ] I can explain the difference between a primitive type and a reference type in Java.
//        - [ ] I can name several primitive types in Java.
//        - [ ] I can explain why multiple number primitive types are used.
//        - [ ] I can give an example of implicit and explicit casting.
//        - [ ] I can explain the difference between a runtime and compile-time error.
//        - [ ] I can identify the major editions of Java.
//        - [ ] I can define what a Java wrapper class is.
//        ### Java II
//        - [ ] I can articulate what OOP is.
//        - [ ] I can identify the four levels of visibility for a class/field/method and the identifiers used.
//        - [ ] I know what class of static methods is often used when working with arrays.
//        - [ ] I can explain the difference between static (class) fields/methods and instance fields/methods.
//        - [ ] I can explain the difference between method overloading and method overriding.
//        - [ ] I can identify the four pillars of object-oriented programming and give examples of each one.
//        - [ ] I can describe the differences between interfaces and abstract classes and their use cases.
//        - [ ] I can generally describe what the Java Collections Framework is and specifically talk about the differences between a list, set, and map.
//        - [ ] I can explain the difference between a checked and unchecked exception.
//        - [ ] I can explain what a Java annotation is, why they are used, and give examples.
//        - [ ] I can explain the difference between the throws and throw keywords with regard to exceptions.
//        ## Skills
//        ### Java I
//        - [ ] I can write a hello world Java program from scratch.
//        - [ ] I can write Java control statements (if, if/else, switch, ternary) and loops (while, do-while, for, for-each) from memory.
//        - [ ] I can write examples of the 8 Java primitive types.
//        - [ ] I can write examples of explicit casting and implicit casting.
//        - [ ] I can convert a numeric string to a number and a number to a numeric string.
//        - [ ] I can define a constant.
//        - [ ] I can write a program that takes in user input and returns an output to the user.
//        - [ ] I can compare two string values.
//        - [ ] I can write out a program comprised of multiple methods.
//        - [ ] I can get the length of string, trim it, get a portion of the string, create a new string replacing some portion of it.
//        ### Java II
//        - [ ] I can write a class that contains both static and instance fields and methods, constructors, setters and getters.
//        - [ ] I can write a program composed of multiple classes requiring instantiation (not just using classes as groups of static methods).
//        - [ ] I can write my own reference type and fill instances of it in an ArrayList and HashMap and use it as a return and input type of a method.
//        - [ ] I can write an abstract class and a subclass that extends from the abstract class.
//        - [ ] I can write multiple interfaces and implement their methods in another class.
//        - [ ] I can create arrays of various data types and sizes with and without using an array initializer.
//        - [ ] I can get the length of an array, get a specific element or range of elements, create a new array replacing some portion of it, and iterate over an array of elements.
//        - [ ] I can do the above with an ArrayList.
//        - [ ] I can comfortably use the helper methods of both Arrays and Collections classes.
//        - [ ] I can write a program that throws a runtime exception.
//        - [ ] I can write an example of method overloading and method overriding.
//        - [ ] I can write a program that reads and writes to a file.
//        - [ ] I can write methods and collections that work with a parent class or interface type but use instances of objects that extend from these parent classes or implement these interfaces (Polymorphism).