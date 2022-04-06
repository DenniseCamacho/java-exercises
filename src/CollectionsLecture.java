import java.util.ArrayList;

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



    }
}