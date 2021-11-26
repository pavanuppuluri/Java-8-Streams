import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationSkip {
    public static void main(String[] args) {

        // Skip top 3 skills of a given stream of skills and print remaining
        List<String> skills= Arrays.asList("C","C++","Java","AWS","Kafka","Mongo");
        skills
                .stream()
                .skip(3)   // Skip first 3 elements
                .forEach(System.out::println);
        // Output	AWS Kafka Mongo


        // Skip first 3 elements in a stream and print remaining
        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6,7,8,9);
        numbersStream
                .skip(3)                    // Skipping first 3 elements
                .forEach(System.out::println);

        // Output 4 5 6 7 8 9
    }
}
