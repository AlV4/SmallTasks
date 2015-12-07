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
