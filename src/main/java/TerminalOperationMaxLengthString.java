import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationMaxLengthString {
    public static void main(String[] args) {
        // If we want to find maximum length value
        // from given stream of strings
        Stream<String> names=Stream.of("C","AWS","PHP","Java");

        //Passing comparator based on string length
            Optional<String> maxString = names
                                        .max(
                                            (s1,s2)-> s1.length()-s2.length()
                                            );

            maxString.ifPresent(System.out::println);

        // Output    Java


    }
}
