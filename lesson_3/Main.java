package OOP_Java.lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", "Петров"));
        students.add(new Student("Василий", "Соловьев"));
        students.add(new Student("Михаил", "Марков"));
        students.add(new Student("Екатерина", "Ветрова"));
        students.add(new Student("Владислав", "Листьев"));
        students.add(new Student("Мария", "Петрова"));

        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher("Иван", "Иванов");
        Teacher teacher2 = new Teacher("Петр", "Петров");
        Teacher teacher3 = new Teacher("Сергей", "Сергеев");
        Teacher teacher4 = new Teacher("Роман ", "Денисов");

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        teacher1.addGroup(new StudentGroup(1, teacher1));
        teacher1.addGroup(new StudentGroup(6, teacher1));
        teacher2.addGroup(new StudentGroup(2, teacher2));
        teacher3.addGroup(new StudentGroup(3, teacher3));
        teacher3.addGroup(new StudentGroup(4, teacher3));
        teacher3.addGroup(new StudentGroup(5, teacher3));
        teacher4.addGroup(new StudentGroup(5, teacher4));
        teacher4.addGroup(new StudentGroup(1, teacher4));
        teacher4.addGroup(new StudentGroup(2, teacher4));
        teacher4.addGroup(new StudentGroup(3, teacher4));


        Collections.sort(teachers, new TeacherComparator());

        TeacherIterator teacherIterator = new TeacherIterator(teachers);
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next());
        }




    }
}
