package students;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private Student student;
    private List<Student> students;

    public ClassRoom() {
        students = new ArrayList<>();
    }

    public void enter(Student student){
        students.add(student);
    }

    public void leave(Student student){
        students.remove(student);
    }

    public int getStudentCount(){
        return students.size();
    }

    public boolean isPresent(Student student){
        if(student != null && students != null){
            if(students.contains(student)){
                return true;
            }
        }
        return false;
    }

    public void printStudentInfo(){
        if(students != null && students.size() > 0){
            for (Student student : students){
                System.out.println(student.getName() + " " + student.getSecondName());
            }
            return;
        }
        System.out.println("Class is empty.");
    }



    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
