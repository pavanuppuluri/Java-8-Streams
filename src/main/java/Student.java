public class Student
{
    Integer rollNumber;
    String name;
    Integer marks[];

    public Student(Integer rollNumber, String name, Integer[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getMarks() {
        return marks;
    }

    public void setMarks(Integer[] marks) {
        this.marks = marks;
    }
}