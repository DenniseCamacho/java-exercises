public class PersonTest {
    public static void main(String[] args) {

        Person person01 = new Person("Dennise");
        person01.setName("Dennise");
        person01.sayHello();
        System.out.println("\nthis is person01: " + person01.getName());

        Person person02 = new Person("Jan");
        person02.setName("Jan");
        person02.sayHello();
        System.out.println("\nthis is person02: " + person02.getName());

        System.out.printf("\nperson01.getName()" + (person01.getName()) + "\nperson02.getName() " + (person02.getName()));
        //why are both names Jan?
        //person01 isnt Jan...



//https://www.youtube.com/watch?v=pgBk8HC7jbU&ab_channel=CodingwithJohn
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());




    }
}
