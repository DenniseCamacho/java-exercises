import java.util.ArrayList;

public class Student {

    private String name;
private ArrayList<Integer> grades;

   public Student(){
   }
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>(grades);
    }

    // returns the student's name
    public String getName(){
        return this.name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        float length = grades.size();
        float sum = 0;
        int i = 0;
        while (i < length) {
            sum += grades.get(i);
            i++;
        }
        System.out.println(length);
        return sum/length;
    }
    public String toString(){
        return name;
    }

}
