import java.util.Scanner; //click option return

//import java.util.Scanner;
//import java.util.*; //<-add all the classes
public class ConsoleExercises {//class
    public static void main(String[] args){//method, main method
//  TODO:Write some Java code that uses the variable pi to output the following:
//      double pi = 3.14159;
//      The value of pi is approximately 3.14.
//      Don't change the value of the variable; instead,
//      reference one of the links above and use System.out.format to accomplish this.
        double pi = 3.14159;  //...add .2f% to make it two decimal places.Vvv
        System.out.printf("The value of pi is approximately %f\n", pi);
//        String myName = String.format("\n%s %s", "Dee", "Sea");
//        System.out.printf(myName);
//        double pi = 3.14159;
//        String output = String.format("the value of pi is %.2fs");
//        System.out.println(output);

// TODO:Prompt a user to enter a integer and store that value in an
//        int variable using the nextInt method.
        //v----
        //tool that helps get input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of sandwiches you'd like to order");
        int usersNumber = sc.nextInt();
        System.out.printf("You want %d sandwiches", usersNumber);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 3 words: ");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//

/**What happens if you input something that is not an integer?**/
        //it gives a type error message.
// TODO: Prompt a user to enter 3 words, and store each of them in a separate variable.
// TODO: Then, display them back in the console, each on a newline.
        System.out.println("\n Please enter your name, favorite color and favorite food");
        String usersNombre = sc.next();
        String usersFavoriteColor = sc.next();
        String usersFavoriteFood = sc.next();
        sc.nextLine(); //the breakpoint for answering the last question.
        System.out.printf("Your name is %s,", usersNombre);
        System.out.printf(" your favorite color is %s.", usersFavoriteColor);
        System.out.printf(" I like %s too.\n", usersFavoriteFood);

/**What happens if you enter less than 3 words?**/
       //You can't print until you do.
/**What happens if you enter more than 3 words?**/
        //The print cuts off the string on three words.
//TODO: Prompt a user to enter a sentence, then store that sentence in a
//TODO: String variable using the next method.
//TODO: Then, display that sentence back to the user.
        System.out.println("\n What is your favorite quote?");
        String usersAns = sc.next();
        System.out.printf("Your quote is: %s\n", usersAns);
/**  do you capture all the words?**/
//no.
//           TODO:     Rewrite the above example using the nextLine method.
        System.out.println("\n What is your favorite quote?");
        String usersAns2 = sc.nextLine();
        System.out.printf("Your quote is: %s\n", usersAns2);
        //tool that helps get input from user.
//Scanner sc = new Scanner(System.in);
//        System.out.println("enter your first name");
//String userInput = sc.next();
//        System.out.println("enter your last name");
//        String userLastName = sc.next();

// TODO: Calculate the perimeter and area of Codeup's classrooms.
//TODO: Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//TODO: Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//                The area of a rectangle is equal to the length times the width, and the
//                perimeter of a rectangle is equal to 2 times the length plus 2 times the
//                width.
//Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        String lengthInput = sc.nextLine();
        System.out.println("Enter the width: ");
        String widthInput = sc.nextLine();

        float length = Float.parseFloat(lengthInput);
        float width = Float.parseFloat(widthInput);
        System.out.println("the area is: " + (length * width) + ".");
        System.out.println("the width is: " + (length * 2 + width * 2) + ".");
//refactor later to use %f
    }
}
