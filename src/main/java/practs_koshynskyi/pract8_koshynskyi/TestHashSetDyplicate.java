package practs_koshynskyi.pract8_koshynskyi;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetDyplicate {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("qwe", "qwe", "qwe", "1"));
        students.add(new Student("asd", "asd", "asd", "1"));
        System.out.println(students);
        //only qwe student be in students because qwe and asd student have same hash
    }
}
