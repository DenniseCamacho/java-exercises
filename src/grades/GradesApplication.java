package grades;

import java.util.HashMap;
import java.util.Set;

public class GradesApplication {
    public static void main(String[] args) {
        //create a hashmap named students.
        HashMap<String, String> students = new HashMap<>();
        //create 4 student objects w/ three grades each.
        Student studentOne = new Student("John");
        studentOne.addGrade(100);
        studentOne.addGrade(90);
        studentOne.addGrade(75);
        students.put("jonjacob12", String.valueOf(studentOne));
        Student studentTwo = new Student("Joe");
        studentTwo.addGrade(99);
        studentTwo.addGrade(50);
        studentTwo.addGrade(89);
        students.put("joeshmoe", String.valueOf(studentTwo));
        Student studentThree = new Student("Joanne");
        studentThree.addGrade(89);
        studentThree.addGrade(99);
        studentThree.addGrade(83);
        students.put("joanneroxanne", String.valueOf(studentThree));
        Student studentFour = new Student("Joy");
        studentFour.addGrade(50);
        studentFour.addGrade(70);
        studentFour.addGrade(75);
        students.put("imjoyful93", String.valueOf(studentFour));

        Set<String> gitHubUserNames = students.keySet();
        for (String gitHubUser : gitHubUserNames){
            System.out.printf(" %s | ", gitHubUser);
        }

        /**
         * Scanner scanner = new Scanner (System.in);
         * String userInput = scanner.nextLine();
         * //or containsKey(userInput)
         * if (gitHubUserNames.contains(userInput)){
         *     soutf("Name: %s GitHub Username: %s %n", students.get(userInput), userInput)
         * } else {
         *     soutf("no user found by the name " + userInput);
         * }
         */

    }

//    TODO: Create the command line interface
//    Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
//
//    After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.
//

}
