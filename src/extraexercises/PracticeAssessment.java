package extraexercises;

public class PracticeAssessment {



    public double factorial(int integer){
            double startNumber = 1;
        if (integer <= 0) {
            System.out.println("please enter an integer");
        } else {
            for (int i = integer; i > 0; i -= 1) {
                System.out.println(startNumber *= i);
                System.out.println("number: " + startNumber);
            }
        }
        System.out.printf("%d! (%d factorial) is",integer, integer);
        return startNumber;


    }

} // <==end of class<-<--<-
