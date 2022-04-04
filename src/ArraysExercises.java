import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        Array Basics
//
//        Create a class inside of src named ArraysExercises.
//        Create a main method for this class to do your work.
//
//      What happens when you run the following code? Why is
//      Arrays.toString necessary? it shows the array, not the #
         /**
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(
        "without Arrays.toString(): " +
        numbers +
        "\n" +
        "with Arrays.toString(): " +
        Arrays.toString(numbers)
        );
         **/
//      Create an array that holds 3 Person objects. Assign a new
//      instance of the Person class to each element. Iterate through
//      the array and print out the name of each person in the array.
         /**
        String[] threePeople = {"Daniel", "David", "Elijah"};
        for (String onePerson : threePeople) {
            System.out.println("this is forloop: " + onePerson);
        }
        addPerson(Arrays.toString(threePeople));
        }
         **/
//      Create a static method named addPerson. It should
//      accept an array of Person objects, as well as a
//      single person object to add to the passed array. It
//      should return an array whose length is 1 greater than
//      the passed array, with the passed person object at
//      the end of the array.
    /**
    public static void addPerson(String a){
        System.out.println(Arrays.toString(a).length());
    }
     **/

    }
}
