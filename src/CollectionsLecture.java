import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CollectionsLecture {
    public static void main(String[] args) {
        /**
        //creating an array list.
        //instead of brackets use <>
        //have to make a food class...
        ArrayList<Food> FoodList = new ArrayList<>();
        //^this creates a new array. its empty.
        //next,
        Food pizza = new Food("marinara", "red pepper", "pepperoni");
        //
        FoodList.add(pizza);
        //arrays have a length property
        //in arraylist a size method.
        System.out.println(FoodList.size());
        //
        **/
//       for (int i = 0; i < FoodList.size(); i++){
////           System.out.println(FoodList.get(i)); //prints out name if override .toString();
//           String name = monsterList.get(i).getName();
//           int damage = monsterList.get(i).getDamage();
//           int hitPoints = monsterList.get(i).getHitPoints();
//           System.out.printf("the %s does %d damage and has %d hitpoints %n", name, damage, hitPoints);
//           //^make "variables for values"
//       }
        /**
        for (Monster monster : monsterList){
            System.out.println("the " + monster.getName() + "has " + monster.getHitPoints() + " hit points and does " + monster.getDamage() + " points of damage when it attacks.");
        }
        **/
//        Create 3 Person objects.
//        Create an ArrayList that holds persons.
//        Add the persons to the ArrayList.
//        Iterate over the ArrayList either with a for loop or an enhanced for loop,
//        printing out to the console each person's name.
        /**
ArrayList<Person> PersonList = new ArrayList<>();
        Person John = new Person("John");
        Person Dennise = new Person("Dennise");
        Person Coco = new Person("Coco");
        PersonList.add(John);
        PersonList.add(Dennise);
        PersonList.add(Coco);
        for (Person person : PersonList){
            System.out.println(person.getName());
        }
         **/
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(42);
        myNumbers.add(56);
        myNumbers.add(43);
        System.out.println(myNumbers.get(1));
        System.out.println(myNumbers);
        //to sort them... sorting an array list of integers.
        //collections is built in, its not a class.
        Collections.sort(myNumbers);
        System.out.println(myNumbers);
//hashmaps ... collections.sort will not work for this.
        //its a map not a list...
        HashMap<String, Integer> careerWins = new HashMap<>();
        careerWins.put("Some0 Name", 1341);
        careerWins.put("Some1 Othername", 1234);
        careerWins.put("And2 Anothername", 2314);

        System.out.println(careerWins.get("Some0 Name"));
        System.out.println(careerWins);
        careerWins.replace("Some0 Name", 2002);
        System.out.println(careerWins);
        System.out.println(careerWins.get("And2 Anothername"));
        //a key and a value... in an order that's not the same.
        //if you want an order, you need to use a list.
        //https://www.geeksforgeeks.org/how-to-iterate-hashmap-in-java/
        //you cant use a for loop, theres no index...use:
        //for(map.Entry<String, Integer> careerWinsEntry : careerWins.entrySet()){
//        System.out.println(careerWinsEntry.getKey() + ":" + careerWins.getValue());
//    }
        //entryset returns the elements in the hashmap.

//grocerylist app optional.
        //come back to it.
        //bonuses, optional.

    }
}