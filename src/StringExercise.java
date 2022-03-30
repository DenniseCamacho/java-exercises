import java.util.Scanner;

public class StringExercise {
    //    TODO:    Create a class named StringExercise with a main method.
    public static void main(String[] args) {
//        String Basics.
//TODO:For each of the following output examples: create a String variable that contains
// the desired output and print it out to the console, you can do this with only one
// String variable and one print statement for each output example.
//                "We don't need no education
//        We don't need no thought control"
        /**
         String message1 = "We don't need no education \nWe don't need no thought control";
         System.out.println(message1);
         **/
//  TODO:      Check "this" out!, "s inside of "s!
        /**
         String message2 = "Check \"this\" out!, \"s inside of \"s!";
         System.out.println(message2);
         **/
//  TODO:          In windows, the main drive is usually C:\
        /**
         String message3 = "In windows, the main drive is usually C:\\";
         System.out.println(message3);
         **/
//  TODO:      I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!
        /**
         String message4 = "I can do backslashes \\, double backslashes \\\\,\n" +
         "and the amazing triple backslash \\\\\\!";
         System.out.println(message4);
         **/
    }
}
class Bob {
    public static void main(String[] args) {
//  TODO: [x]Create a class named Bob with a main method for the following exercise.
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//        Bob answers 'Sure.' if you ask him a question.
//        [x](the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him.
//        [x](the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//        [x](empty input)
//        [x]He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your
//        command line application can have a conversation with Bob.
        //create Strings with Bob's responses(4)
        String messageWithQuestionMark = "Sure.";
        String messageWithExclamation = "Whoa, chill out!";
        String messageWithNothing = "Fine. Be that way!";
        String messageWithAnythingElse = "Whatever.";
        String contQuestion = "Do you still want to talk to Bob?";
        //create a Scanner.
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to talk to Bob? yes/no");
        String usersResponse = sc.nextLine();
        String continues;
        switch(usersResponse) {
            case "no":
                System.out.println("Bob: ...");
                break;
            case "yes":
                System.out.println("What would you like to say?");
                System.out.println("Bob: ...");
                String usersResponse2 = sc.nextLine();
                if (usersResponse2.indexOf("?") >= 0){
                    System.out.println(messageWithQuestionMark);
                } else if (usersResponse2.indexOf("!") >= 0){
                    System.out.println(messageWithExclamation);
                } else if (usersResponse2.length() < 1){
                    System.out.println(messageWithNothing);
                } else {
                    System.out.println(messageWithAnythingElse);
                }
                System.out.println(contQuestion);
                continues = sc.nextLine();
        }








//       if (usersResponse.equals("no")){
//               System.out.println("He's busy anyway.");
//           } else if (usersResponse.equals("yes")) {
//       }
//        String usersResponse2 = sc.nextLine();
//       if (usersResponse2.equals("hi")){
//
//       }


//            System.out.println("\n Please enter your name, favorite color and favorite food");
//            String usersResponse = sc.next();
//            if (usersResponse.equals()) {
//                System.out.println(messageWithNothing);

        //(if the input ends with a question mark)
        //(the input ends with an exclamation mark)
        //(empty input)
        //'Whatever.' to anything else.

    }
}
