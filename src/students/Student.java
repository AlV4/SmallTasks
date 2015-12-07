package students;

public class Student {
    private String name;
    private String secondName;

    public Student() {
    }

    private Student(String name, String secondName){
        setName(name);
        setSecondName(secondName);
    }

    @Override
    public String toString() {
        return "{" + getName() + " " + getSecondName()+ "}";
    }

    @Override
    public boolean equals(Object o) {
       if(o instanceof Student){
           Student student = (Student)o;
           if((student.getName()!= null && student.getSecondName() != null &&
                   getName().trim().toLowerCase().equals(student.getName().trim().toLowerCase())
                   && getSecondName().trim().toLowerCase().equals(student.getSecondName().trim().toLowerCase())){
               return true;
           }
       }
        return false;
    }


    public static Student studentCreator(String name, String secondName){
        return new Student(name, secondName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
