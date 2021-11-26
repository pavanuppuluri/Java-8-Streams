import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TerminalOperationCollectorsToMapStudentFavSubject {
    public static void main(String[] args) {

        StudentFavSubject studentFavSubject1=new StudentFavSubject(1,"Maths");
        StudentFavSubject studentFavSubject2=new StudentFavSubject(1,"Science");
        StudentFavSubject studentFavSubject3=new StudentFavSubject(1,"Social");
        StudentFavSubject studentFavSubject4=new StudentFavSubject(2,"Social");
        StudentFavSubject studentFavSubject5=new StudentFavSubject(2,"Science");
        StudentFavSubject studentFavSubject6=new StudentFavSubject(3,"Maths");

        List<StudentFavSubject> studentFavSubjectList= Arrays.asList(studentFavSubject1,
                                                                        studentFavSubject2,studentFavSubject3,
                                                                        studentFavSubject4,studentFavSubject5,studentFavSubject6);
        Map<Integer,String> studentsFavSubMap = studentFavSubjectList.stream().collect(Collectors.toMap(
          StudentFavSubject::getRollNumber, // Key
                StudentFavSubject::getFavoriteSubject, // Value
                (sub1,sub2)->sub1+","+sub2 // Merge function
        ));

        studentsFavSubMap.forEach((k,v)-> System.out.println(k+"-"+v));


    }
}

class StudentFavSubject
{
    Integer rollNumber;

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    String favoriteSubject;

    public StudentFavSubject(Integer rollNumber, String favoriteSubject) {
        this.rollNumber = rollNumber;
        this.favoriteSubject = favoriteSubject;
    }
}
