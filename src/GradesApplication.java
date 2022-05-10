import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Student student1 = new Student("Paul", new ArrayList<>(3));
        student1.addGrade(70);
        student1.addGrade(75);
        student1.addGrade(80);
        Student student2 = new Student("Peter", new ArrayList<>(3));
        student2.addGrade(70);
        student2.addGrade(50);
        student2.addGrade(80);
        Student student3 = new Student("Philemon", new ArrayList<>(3));
        student3.addGrade(90);
        student3.addGrade(72);
        student3.addGrade(89);
        Student student4 = new Student("Psalm", new ArrayList<>(3));
        student3.addGrade(90);
        student3.addGrade(72);
        student3.addGrade(89);

        HashMap students = new HashMap<>(4);
        students.put(student1, "paulsGithub");
        students.put(student2, "petersGithub");
        students.put(student3, "philemonGithub");
        students.put(student4, "psalmsGithub");

        System.out.println(students);
        System.out.println(students.get(student1));
        System.out.println(student1);
    }
}