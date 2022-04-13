package extraexercises;

public class PracticeAssessment {



    public int factorial(int integer){
            int startNumber = 1;

        if (integer <= 0) {
            System.out.println("please enter an integer");
        } else {
            System.out.printf("%d! (%d factorial) is ",integer, integer);
            for (int i = integer; i > 0; i -= 1) {
                System.out.printf("%d x ", i);
                startNumber *= i;
            }
        }
        System.out.println(startNumber);
        return startNumber;


    }

} // <==end of class<-<--<-
