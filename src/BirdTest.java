public class BirdTest {
    public static void main(String[] args) {

        /**
        Duck mallard = new Duck();
        mallard.setName("Mallard Duck");
        System.out.println(mallard.getName() + " goes ");
        mallard.makeNoise();
        **/
        //you had to add makeNoise to the duck class, or else
        //it wouldve given you bird class makeNoise();
        //you have to override it.
        //super class is bird, subclass is duck.
        /**
        Finch lesserGoldFinch = new Finch();
        lesserGoldFinch.makeNoise();
         **/
        //^you have to make a new finch class for this to work.

        //creating a new bird object, ref variable, assignment of reference variable.
        Bird theBird = new Bird();//its running a method...a default constructor...
        Bird myDuck = new Duck();
        myDuck.makeNoise();
        //an array that takes in different objects.
        //polymorphism ... make an array of different kinds of birds.
        /**
        public Bird(){
        } this is the def constructor.
         **/


    }
}
