package extraexercises;

import java.util.Scanner;

public class Input {
    private Scanner scanning;

    public Input() {
        scanning = new Scanner(System.in);
    }
    public String getString() {
        return scanning.nextLine();
    }

}//end of Input class
