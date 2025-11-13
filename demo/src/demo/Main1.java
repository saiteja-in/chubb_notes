package demo;
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
            new Student("Teja", 21, 85.5),
            new Student("Sharath", 23, 92.0),
            new Student("Kushal", 20, 85.5),
            new Student("Sai", 22, 78.0)
        ));
        students.sort((a,b)->Double.compare(a.getMarks(), b.getMarks()));
        System.out.println(students);
        
    }
}