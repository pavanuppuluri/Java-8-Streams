import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationMinLengthString {
    public static void main(String[] args) {
        // Find string with minimum length
        Stream<String> stringStream=Stream.of("C","AWS","PHP","Java");

        //Passing comparator based on string length
            Optional<String> minString = stringStream
                                        .min(
                                            (s1,s2)-> s1.length()-s2.length()
                                            );

            minString.ifPresent(System.out::println);

        // Output    C


    }
}
