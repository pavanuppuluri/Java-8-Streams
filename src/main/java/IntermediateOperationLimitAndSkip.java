import java.util.stream.Stream;

public class IntermediateOperationLimitAndSkip {
    public static void main(String[] args) {
        // Limit infinite stream to size 10
        // Skip first 3 elements in that and
        // print remaining

        Stream<Integer> integerStream = Stream.iterate(1, n-> n+1);
        integerStream
                .limit(10)                  // Limiting infinite stream to size 10
                .skip(3)                    // Skipping first 3 elements
                .forEach(System.out::println);

        // Output 4 5 6 7 8 9 10
    }
}
