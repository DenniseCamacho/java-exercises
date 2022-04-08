package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input () {
        sc = new Scanner(System.in);
    }

    public String getString() {
        return sc.nextLine();
    }

    public boolean yesNo() {
        sc.nextLine();
        String userInput = getString();
        return (
                userInput.equalsIgnoreCase("y")
                        ||
                        userInput.equalsIgnoreCase("yes")
        );
    }
    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo(); // calling itself and using method overloading to call the other version of itself
    }

    public int getInt() {
        try {
            int inputInt = Integer.valueOf(getString());
            return inputInt;
        } catch (Exception e) {
            System.out.println("Must enter a valid integer: ");
            sc.nextLine();
            return getInt();
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInt = getInt();

        if(userInt > max || userInt < min) {
            return getInt(min, max);
        }

        return userInt;

    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt + " between " + min + " and " + max + ": ");
        return getInt(min, max);
    }
    //
//
    public double getDouble () {
        try {
            double userInput = Double.valueOf(getString());
            return userInput;
        } catch (Exception e) {
            System.out.println("Must enter a valid double: ");
            sc.nextLine();
            return getDouble();
        }

    }

    public double getDouble (String prompt) {
        System.out.println(prompt);
        return getDouble();
    }
    //
    public double getDouble(double min, double max) {
        System.out.println("Please input a number between " + min + " and " + max + ": ");

        double userInput = getDouble();

        if(userInput > max || userInput < min) {
            return getDouble(min,max);
        }

        return userInput;

    }



}
