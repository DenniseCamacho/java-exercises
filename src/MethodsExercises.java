import java.util.Scanner;
//you can only have one main method.
public class MethodsExercises {
/**
     public static int countTo100(int num) {
     // }
     public static void countTo100(int num){
     if (num > 100){
     System.out.println("done.");
     return;
     }
     System.out.println(num);
     countTo100(num + 1);
     } //invoked in main.
     **/
/**
     public static int countTo100(int num){
     System.out.println(num);
     if(num == 100){
     return 1;
     }
     return countTo100(num + 1);
     }
     **/
/**
 // public static int addNums(int num) {
 // }

 public static int addNums(int num) {
 if (num == 1){
 return 1;
 }
 return num + addNums(num - 1);
 }
 **/

//TODO: Exercise #1:
/**
 //Addition
 public static int addSome(int n, int n2){
 return n + n2;
 }
 public static void addSomeMsg(){
 System.out.println("Add: ");
 }
 //Subtraction
 public static int subtractMe(int n1 ,int n2) {
 return n1 - n2;
 }
 public static void subSomeMsg(){
 System.out.println("Subtract: ");
 }
 //Multiplication
 public static int multiplyMe(int n1 ,int n2) {
 return n1 * n2;
 }
 public static void mulSomeMsg(){
 System.out.println("Multiply: ");
 }
 //Division
 public static int divideMe(int n1 ,int n2) {
 return n1 / n2;
 }
 public static void divSomeMsg(){
 System.out.println("Divide: ");
 }
 //Modulus
 public static int modulusMe(int n1, int n2){
 return n1 % n2;
 }

public static void main(String[] args) {
    //        addSomeMsg(); System.out.println(addSome(2,2));
    //        subSomeMsg(); System.out.println(subtractMe(10,5));
    //        mulSomeMsg(); System.out.println(multiplyMe(5,5));
    //        divSomeMsg(); System.out.println(divideMe(10,5));
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Please enter two numbers: ");
    System.out.println("Add: " + addSome(2,2));
    System.out.println("Subtract: " + subtractMe(10, 5));
    System.out.println("Multiply: " + multiplyMe(5, 5));
    System.out.println("Divide: " + divideMe(10, 5));

}
 **/
//Do the above with recursion. <-bonus

//TODO: Exercise #2:
/**
     * //[x]create the scanner.
     *     //[x]get users input.
     *     //[x]if users input is greater than 10
     *     // or less than 0, continue to prompt user.
     *     //[x]user exits when entering correct number.
    public static void getInteger(int n){
        if (n > 10 || n <= 0) {
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("please enter a valid number");
                n = sc.nextInt();
            } while (n > 10 || n <= 0);
        }
            System.out.println("thank you! goodbye.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-10");
        int usersResp = sc.nextInt();
        getInteger(usersResp);
    }
     **/

//TODO: Exercise #3:
/**
 *

 *
**/
public static void factorialCheck(long n){

    }
public static void main(String[] args) {
    //CREATE THE SCANNER
    Scanner sc = new Scanner(System.in);
    //PROMPT THE USER
    System.out.println("Please enter a number from 1-10");
    int usersAnswer = sc.nextInt();

//    [x]Prompt the user to enter an integer from 1 to 10.
//    []Display the factorial of the number entered by the user.
//    []Ask if the user wants to continue.
//    []Use a for loop to calculate the factorial.
//    []Assume that the user will enter an integer,
//    []but verify it’s between 1 and 10.
//    []Use the long type to store the factorial.
//    []Continue only if the user agrees to.
//    *A factorial is a number multiplied by each of the numbers before it.
//    *Factorials are denoted by the exclamation point (n!). Ex:

}

//TODO: Exercise #4:
/***
// Create an application that simulates dice rolling.
//[]Ask the user to enter the number of sides for a pair of dice.
//[]Prompt the user to roll the dice.
//[]"Roll" two n-sided dice, display the results of each
//[]ask the user if he/she wants to roll the dice again.
//[?]Use static methods to implement the method(s) that
// generate the random numbers.
//[]Use the .random method of the java.lang.Math
// class to generate random numbers.
 ***/
}





//TODO BONUS(optional):
/**
//Game Development 101
//Welcome to the world of game development!
// You are going to build a high-low guessing game.
// []Create a class named HighLow inside of src.
//The specs for the game are:
//       []Game picks a random number between 1 and 100.
//       []Prompts user to guess the number.
//       []All user inputs are validated.
//       []If user's guess is less than the number, it outputs "HIGHER".
//       []If user's guess is more than the number, it outputs "LOWER".
//       []If a user guesses the number, the game should
//       declare "GOOD GUESS!"
//        Hints:
//        Use the random method of the java.lang.Math
//        class to generate a random number.
//        Bonus:
//        Keep track of how many guesses a user makes.
//        Set an upper limit on the number of guesses.
 **/

// TODO: Pair programming exercise(optional):
/**
//        Console Adventure Game! ///optional
//
//                Using what you've learned so far in the Java I module, we're going to create a classic text-based RPG game. These types of online role-playing games date back to the 70's and solely rely on a text-based interface. In this case, we'll be using Java to run this game in our console.
//
//        The idea is that your game will prompt the user, who will then input answers through the console (using the Scanner class). How the game changes depending on their answer is completely up to you! Below are a list of suggested features to get you started:
//
//        Ask if the user is ready to start. If they type in "yes", start the game.
//        Ask the user for their name. Store this as a variable to personalize the adventure.
//                A classic RPG will have the hero going through different scenarios and battling their enemies.
//        Display enemy stats and hero stats. Properties and values can be assigned by you.
//        For example: Health, Attack Points, etc.
//                Decide on what actions your hero can take.
//                Attack (decreases enemyHealth)
//        Drink potion (adds to heroHealth)
//        Run? (ends the game)
//        Keep asking for user input until the enemyHealth reaches 0, then end the game.
//                Bonuses
//
//        Allow the user to specify hero stats and enemy stats.
//        Automate an enemyAttack after each time the hero takes a turn.
//                End the game if either heroHealth or enemyHealth drops to 0.
//        Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.
//
//                Remember that these are only suggestions. Feel free to get creative and have fun!!
 **/



/**Notes=======v====v=v=v=v=v**/
 /**
//--------------
//public class MethodLecture {
//
//    // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)
//
//    // no input or returned output
//    public static void sayGreeting() {
//        System.out.println("Hello");
//    }
//
//    // no returned output with input
//    public static void sayInput(String input) {
//        System.out.println(input);
//    }
//
//    // returned output without input
//    public static int returnSeven() {
//        return 7;
//    }
//
//    // return output given an input
//    public static int returnInt(int someInt) {
//        return someInt;
//    }
//
//    // return value based on multiple inputs
//    public static double returnProductOfThreeNums(double num1, double num2, double num3) {
//        return num1 * num2 * num3;
//    }
//
//    // return type different from input type
//    public static int returnLengthOfString(String input) {
//        return input.length();
//    }
//
//    // multiple input types
//    public static void printCharMultipleTimes(char c, int repetitions) {
//        System.out.println(String.valueOf(c).repeat(repetitions));
//    }
//
//    // calling other methods from a method
//    public static void printCharSevenTimes(char c) {
//        printCharMultipleTimes(c, returnSeven());
//    }
//
//    // public static void main(String[] args) {
//    // sayGreeting();
//
//    // sayInput("Howdy");
//
//    // System.out.println(
//    //         returnSeven()
//    // );
//
//    // System.out.println(
//    //         returnInt(3)
//    // );
//
//    // System.out.println(
//    //         returnProductOfThreeNums(2.4, 8.7, 9)
//    // );
//
//    // System.out.println(
//    //         returnLengthOfString("Bob")
//    // );
//
//    // printCharMultipleTimes('m', 5);
//
//    // printCharSevenTimes('|');
//
//    // }
//
//    // ----------- OVERLOADING
//
//    /*
//
//        Method overloading is a way to define the same method with different method signatures.
//        It is a convenience to prevent the programmer from having to create many more method names
//        when defining functionality for various data type inputs.
//
//        Much of the Java language is defined using overloaded methods (e.g.
//
//        public static void main(String[] args) {
//
//            int firstValue = Integer.valueOf("0011", 2);
//            System.out.println(firstValue);
//
//            int secondValue = Integer.valueOf("0011");
//            System.out.println(secondValue);
//
//        }
//
//    public static void sayHello() {
//        sayHello("Hello", "World");
//    }
//
//    public static void sayHello(int times) {
//        for (int i = 0; i < times; i += 1) {
//            sayHello();
//        }
//    }
//    public static void sayHello(String name) {
//        sayHello("Hello", name);
//    }
//    public static void sayHello(String greeting, String name) {
//        System.out.println(greeting + ", " + name + "!");
//    }
//
//    // different return type is not enough alone to overload a method
//    // must have a unique method signature
//
//    // public static double sayHello(int x) {
//    //    return x;
//    // }
//
//    // with a unique method signature, can return any type
//    public static double sayHello(double x) {
//        return x;
//    }
//
//    // public static void main(String[] args) {
//    //     sayHello();
//    //     sayHello(2);
//    //     sayHello("John");
//    //     sayHello("Salutations", "Kevin");
//    // }
//
//
//    // ----------- RECURSION
//
//
//
//        BASICS
//
//        Recursion is a process where a method calls itself repeatedly.
//
//        A method that calls itself is referred to as a "recursive" method.
//
//        A recursive method must have a condition that will end the recursive calls, called a "base case."
//
//        Without a base case, a recursive method will run out of memory and throw a StackOverflow exception.
//
//        USE CASES
//
//        Recursion allows programmers to express certain algorithms in a simpler way. Recursive solutions can
//        be less efficient and possibly throw an exception if there are too many recursive calls.
//
//
//
//    public static long powersOfTen(int n) {
//        if (n == 0) return 1;
//        if (n == 1) return 10;
//        return powersOfTen(n-1) * 10;
//    }
//
//    public static void countTo100Loop(int num) {
//        for (int i = num; i <= 100; i += 1) {
//            System.out.println(i);
//        }
//    }
//
//    // TODO: use recursion to print out a given number up through 100
//    // public static int countTo100(int num) {
//    // }
//
//
//    // TODO: use recursion to add all numbers up from 1 to a given number
//    // public static int addNums(int num) {
//    // }
//
//    // TODO: use recursion to ensure only the string "hello" is returned from the function
//    // public static String getHello() {
//    // }
//
//    // public static void main(String[] args) {
//    //     System.out.println(powersOfTen(1));
//    //     System.out.println(powersOfTen(3));
//    //
//    //     countTo100Loop(4);
//    //
//    // }
//
//
//}
**/