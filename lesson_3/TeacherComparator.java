package OOP_Java.lesson_3;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    public int compare(Teacher teacher1, Teacher teacher2) {
        if (teacher1.getNumberOfGroups() > teacher2.getNumberOfGroups()) {
            return -1;

        } else if (teacher1.getNumberOfGroups() < teacher2.getNumberOfGroups()) {
            return 1;
        }
        return 0;
    }
}
