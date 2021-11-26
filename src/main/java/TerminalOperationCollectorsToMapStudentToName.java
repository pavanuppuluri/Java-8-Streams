import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TerminalOperationCollectorsToMapStudentToName {
    public static void main(String[] args) {
        Student s1=new Student(1,"Ram", new Integer[]{90,80,88,77,66,54,89});
        Student s2=new Student(2,"Sam", new Integer[]{76,65,98,57,63,45,99});
        Student s3=new Student(3,"Uma", new Integer[]{60,70,45,75,44,56,76});

        List<Student> studentList= Arrays.asList(s1,s2,s3);

        // Code to collect student roll numbers and their names in a map
        Map<Integer, String> studentNamesMap= studentList.stream().collect(Collectors.toMap(Student::getRollNumber, Student::getName));
        studentNamesMap.forEach((k,v)-> System.out.println(k+" "+v));

        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6);
        numbersList.parallelStream().
                forEach(System.out::println);


    }
}
