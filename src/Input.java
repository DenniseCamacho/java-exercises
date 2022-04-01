import java.util.Scanner;

public class Input {
    private Scanner input; //scanner obj

    public Input() {
        input = new Scanner(System.in);
    }

    public String getString(){
        return input.nextLine();

    }

    public boolean yesNo() {
        String userInput = getString();
        return (
                userInput.equalsIgnoreCase("y")
                        ||
                        userInput.equalsIgnoreCase("yes")
        );
    }
        public int getInt(){
            try {
                int inputInt = input.nextInt();
                    return inputInt;
             } catch (Exception e) {
            System.out.println("valid int please");
            input.nextLine();
            return getInt();
        }
            //function in a function, reccursion.

        public int getInt(int min, int max) {
                System.out.println("please enter" + min + "and" + max);
                int userInt = getInt();
                if(userInt > max || userInt < min){
                    return getInt(min, max);
                }
                    return userInt;
                //if it matches the
            // first return itll return anyway.
            }
        }

        public double getDouble() {
            try {
                double userInput = input.nextDouble();
                return userInput;
            } catch (Exception e) {
                System.out.println("Must enter a valid double:");
                input.nextLine();
                return getDouble();
            }
        }


    }


}
