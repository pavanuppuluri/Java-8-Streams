import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationFromCollection {
    public static void main(String[] args) {
        List<String> listOfSkills= new ArrayList<>();
        listOfSkills.add("C");
        listOfSkills.add("C++");
        listOfSkills.add("Java");

        Stream<String> stream=listOfSkills.stream();
        stream.forEach(System.out::println);
    }
}
