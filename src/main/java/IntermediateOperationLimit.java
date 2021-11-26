import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationLimit {
    public static void main(String[] args) {
        // Print top 3 skills of a given stream of skills
        List<String> skills= Arrays.asList("C","C++","Java","AWS","Kafka","Mongo");
        skills.stream().limit(3).forEach(System.out::println);


        // Print first 10 natural numbers using limit
        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 1);
        integerStream
                .limit(10)                    // Limiting stream size to 10
                .forEach(System.out::println);

        // Output 1 2 3 4 5 6 7 8 9 10
    }
}
