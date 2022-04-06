package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {

        Student studentOne = new Student("Dennise");
        studentOne.addGrade(70);
        studentOne.addGrade(60);
        studentOne.addGrade(75);
        studentOne.addGrade(89);
        studentOne.addGrade(90);
        studentOne.addGrade(55);
        System.out.println(studentOne.getGrades());
        System.out.println(studentOne.getGradeAverage());

        Student studentTwo = new Student("John");
        studentTwo.addGrade(100);
        studentTwo.addGrade(99);
        studentTwo.addGrade(75);
        studentTwo.addGrade(89);
        studentTwo.addGrade(90);
        studentTwo.addGrade(85);
        System.out.println(studentTwo.getGrades());
        System.out.println(studentTwo.getGradeAverage());







    }
}
