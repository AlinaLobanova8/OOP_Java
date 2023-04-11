package OOP_Java.lesson_3;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String lastName;
    private List<StudentGroup> groups;

    public Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.groups = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void addGroup(StudentGroup studentGroup) {
        groups.add(studentGroup);
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public int getNumberOfGroups() {
        return groups.size();
    }

    public String toString() {

        return String.format("Teacher %s %s has %d groups", name, lastName, groups.size());
    }
}
