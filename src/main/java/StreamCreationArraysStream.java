import java.util.Arrays;
import java.util.stream.Stream;


public class StreamCreationArraysStream {
    public static void main(String[] args) {

        String[] skills={"C","C++","Java"};
        Stream<String> skillsStream = Arrays.stream(skills);
        skillsStream.forEach(System.out::println);


    }
}
