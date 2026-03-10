package practs_koshynskyi.pract8_koshynskyi;

import java.util.*;

public class StudentRegistry {
    private final List<Student> list = new ArrayList<>();
    private final Set<String> emails = new HashSet<>();
    private final Map<String, Student> map = new HashMap<>();

    public StudentRegistry() {}
    public Student addStudent(Student student) {
        if (containsEmail(student.getEmail())) {
            throw new IllegalArgumentException(String.format("Student with email %s already exists", student.getEmail()));
        }
        if (map.containsKey(student.getId())) {
            throw new IllegalArgumentException(String.format("Student with id %s already exists", student.getEmail()));
        }
        list.add(student);
        emails.add(student.getEmail());
        map.put(student.getId(), student);
        return student;
    }
    public boolean containsEmail(String email) {
        return emails.contains(email);
    }
    public Optional<Student> findStudentById(String id) {
        return Optional.ofNullable(map.get(id));
    }
    public void removeStudentById(String id) {
        if (!map.containsKey(id)) {
            throw new IllegalArgumentException(String.format("Student with id %s does not exist", id));
        }
        Student student = map.get(id);
        list.remove(student);
        emails.remove(student.getEmail());
        map.remove(id);
    }
}