package redo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedoControlFlow {
//    Create an integer variable i with a value of 5.
    private int fiveToFifteen = 5;
    private int fromOneToHundred = 1;
    private Map<String, List> maplist = new HashMap<>();
    private ArrayList<String> strings = new ArrayList<>();
    private ArrayList<Integer> integers = new ArrayList<>();
public static void main(String[] args) {
    RedoControlFlow number = new RedoControlFlow();

//    do {
//        System.out.println(i.i++);
//    } while (i.i <= 15);
    //[x]Write a program that prints the numbers from 1 to 100.
//    do {
//        System.out.println(number.fromOneToHundred++);
//    } while (number.fromOneToHundred <= 100);
    //[]For multiples of three: print “Fizz” instead of the number.

    for (int i = 0; i < 100; i++) {
        number.fromOneToHundred++;
    if (number.fromOneToHundred % 3 == 0) {
        number.strings.add("fizz");
    } else {
        number.integers.add(number.fromOneToHundred);
    }
    number.maplist.put(String.valueOf(number.strings), number.integers);
    }


    System.out.println(number.maplist);

//    for (int i = 0; i < 100; i += 1) {
//        System.out.println(number.fromOneToHundred++);
//        if (number.fromOneToHundred % 3 == 0)
//            number.stringIntArray.put("fizz", number.fromOneToHundred);
//    }



}



}
