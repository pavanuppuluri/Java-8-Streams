import java.util.Arrays;
import java.util.stream.Stream;

    public class StreamCreationArrayStreamRange {
        public static void main(String[] args) {
            String[] skills={"C","C++","Java","AWS","MongoDB","Kafka"};
            Stream<String> skillsStream = Arrays.stream(skills,1,4);
            skillsStream.forEach(System.out::println);
        }
    }


