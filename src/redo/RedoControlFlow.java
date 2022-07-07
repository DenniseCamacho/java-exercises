package redo;

public class RedoControlFlow {
//    Create an integer variable i with a value of 5.
    int i = 5;
//    Create a while loop that runs so long as i is less than or equal to 15
//    Each loop iteration, output the current value of i, then increment i by one.
//    Your output should look like this:
//
//            5 6 7 8 9 10 11 12 13 14 15
public static void main(String[] args) {
    RedoControlFlow i = new RedoControlFlow();

    do {
        System.out.println(i.i++);

    } while (i.i <= 15);



}



}
