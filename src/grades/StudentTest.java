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







    }
}
