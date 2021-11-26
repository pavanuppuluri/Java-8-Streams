import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationMaxLength {
    public static void main(String[] args) {
        // If we want to find minimum length value
        // from given stream of strings
        Stream<String> names=Stream.of("C","AWS","PHP","Java");

        // Below code first maps string to
        // its length. After that applies max()
        // terminal operation
        Optional<Integer> maxLength = names
                .map(s->s.length())
                .max((l1,l2)-> l1-l2);

        maxLength.ifPresent(System.out::println);

        // Output 6


    }
}
