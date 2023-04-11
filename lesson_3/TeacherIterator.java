package OOP_Java.lesson_3;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator implements Iterator<Teacher> {

    private List<Teacher> teachers;
    private int currentPosition;

    public TeacherIterator(List<Teacher> teachers) {
        this.teachers = teachers;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < teachers.size();
    }

    @Override
    public Teacher next() {
        return teachers.get(currentPosition++);
    }
} 
