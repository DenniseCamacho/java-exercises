package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(){}

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();

    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
      grades.add(grade);
    }


    public double getGradeAverage(){
        double sum = 0;
        int theLength = grades.size();
        for (int grade : grades){
            sum += grade;
        }
        return sum / theLength;
        //https://dirask.com/posts/Java-sum-all-ArrayList-elements-jm3PZD
    }
}




//        Create a Student class
//
//        Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:
//
//
//// returns the student's name
//        public String getName();
//// adds the given grade to the grades property
//        public void addGrade(int grade);
//// returns the average of the students grades
//        public double getGradeAverage();
