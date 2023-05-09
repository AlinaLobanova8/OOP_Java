package OOP_Java.lesson_3;

public class Student {
    private String name;
    private String lastName;

    Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String toString() {
        return String.format("Name: %s  Lastname: %s", name, lastName);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
