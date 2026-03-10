package practs_koshynskyi.pract8_koshynskyi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentRegistryTest {
    StudentRegistry sr = new StudentRegistry();
    Student student1;
    Student student2;
    Student student3;

    @BeforeEach
    public void setUp() {
        sr = new StudentRegistry();
        student1 = new Student("pupik", "pupukovich", "asd@asd.com", "1");
        student2 = new Student("name", "surname", "email@gmail.com", "2");
        student3 = new Student("qwe", "qwe", "qwe@qwe.qwe", "3");
        sr.addStudent(student1);
        sr.addStudent(student2);
        sr.addStudent(student3);
    }

    @Test
    public void removeById() {
        sr.removeStudentById(student1.getId());
        Assertions.assertFalse(sr.findStudentById(
                student1.getId()).isPresent() ||
                sr.containsEmail(student1.getEmail()));
    }

    @Test
    public void removeByIdWhenDontExist() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                        sr.removeStudentById("123"));
    }

    @Test
    public void canAddStudentWithEmailThatDeleted() {
        sr.removeStudentById(student1.getId());
        Assertions.assertEquals(student1, sr.addStudent(student1));
    }

    @Test
    public void cantAddStudentWithEmailThatExist() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                        sr.addStudent(student1));
    }
}
