package OOP_Java.lesson_3;

import java.util.List;

public class StudentGroup {
    private List<Student> students;
    private int groupNumber;
    private Teacher teacher;

    public StudentGroup(int groupNumber, Teacher teacher) {
        this.groupNumber = groupNumber;
        this.teacher = teacher;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
