package extraexercises;


public class ExtraExercisesTest {

    public static void main(String[] args) {

        //or use extends...
        //public class ExtraExercisesTest extends ExtraExercises.
        ExtraExercises ee = new ExtraExercises();
        System.out.println(ee.getType("What is this even"));
        System.out.println(ee.getType(22));
        System.out.println(ee.getType(false));
        System.out.println(ee.getType('e'));
        System.out.println(ee.getType(ee));
        System.out.println("---");

//        System.out.println(ee.howManyCapitals("hellOTHere"));
        System.out.println(ee.howManyCapitals("YAYitWORKED"));
        System.out.println("---");

//        System.out.println(ee.countVowels("Kiindneess"));
//        System.out.println(ee.countVowels("Works without love is meaningless"));
        System.out.println(ee.countVowels("YayItWorked21"));
        System.out.println("---");

        System.out.println(ee.everyLetter("texas", 5));


//        Input input = new Input();
//        System.out.println("What is your name?");
//        String usersAnswer = input.getString();
//        System.out.println(usersAnswer + " is a nice name.");


    }
}
