package Day56.Office_Hour_02_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    String studentName;

    public Student(String studentName){
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return studentName;
    }
}

class School {
    String schoolName;
    List<Student> allStudentsList;

    public School (String schoolName, List<Student> allStudentsList){
        this.schoolName = schoolName;
        this.allStudentsList = allStudentsList;
    }

    public void addNewStudent(Student student){
        this.allStudentsList.add(student);
    }

    public void addNewStudent(Student[] students){
        this.allStudentsList.addAll(Arrays.asList(students) );
    }

    public void addNewStudent(List<Student> listOfStudents){
        this.allStudentsList.addAll(listOfStudents);
    }

    @Override
    public String toString(){
        return "" + allStudentsList;
    }
}

public class AssociationExample {

    public static void main(String[] args) {
        Student s1 = new Student("Hasan");
        System.out.println("s1 = " + s1);
        Student s2 = new Student("Muge");
        Student s3 = new Student("Aiko");
        Student s4 = new Student("Nastya");
        Student s5 = new Student("Shux");

        List<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        School cybertek = new School("Cybertek", list);
        cybertek.addNewStudent(new Student("Irina"));
        cybertek.addNewStudent(new Student("Denis"));

        Student[] students = {
                new Student("Gulnaz") ,
                new Student("Roksana")};

        cybertek.addNewStudent(students);

        System.out.println("cyberter.allStudentsList = " + cybertek.allStudentsList);
       // System.out.println("cyberter.schoolName = " + cybertek.schoolName); // Cybertek

        for( Student eachStudent : cybertek.allStudentsList  ){
            System.out.println("eachStudent = " + eachStudent);
        }

        System.out.println("cybertek = " + cybertek);
    }
}