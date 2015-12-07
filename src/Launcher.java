import students.ClassRoom;
import students.Student;

import java.util.Arrays;

public class Launcher {

    public static void main(String[] args) {

        ClassRoom clas = new ClassRoom();
        Student s = new Student();
        s.setName("Vasya");
        s.setSecondName("Ivanov");
        clas.enter(s);
        clas.enter(Student.studentCreator("Ivan", "Petrov"));
        clas.enter(Student.studentCreator("Petro", "Sidorov"));
        clas.enter(Student.studentCreator("Sidor", "Vasiliev"));
        clas.printStudentInfo();
        System.out.println(clas.isPresent(Student.studentCreator("Petro", "Sidorov")));
        System.out.println(clas.getStudentCount());
        clas.leave(s);
        clas.printStudentInfo();
        System.out.println(Arrays.asList(clas.getStudents()));
    }

}
