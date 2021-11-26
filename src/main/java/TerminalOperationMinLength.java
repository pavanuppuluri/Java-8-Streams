import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationMinLength {
    public static void main(String[] args) {
        // If we want to find minimum length value
        // from given stream of strings
        Stream<String> names=Stream.of("C","AWS","PHP","Java");

        // Below code first maps string to
        // its length. After that applies min()
        // terminal operation
        Optional<Integer> minLength = names
                .map(String::length)
                .min((l1,l2)-> l1-l2);

        minLength.ifPresent(System.out::println);

        // Output 3


    }
}
