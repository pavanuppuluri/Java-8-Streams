import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationFindAnyParallel {
    public static void main(String[] args) {
        // Find any element of a given stream

        Stream<String> names= Stream.of("Anand","Sruthi","Uma");

        // Creating parallel stream
        Optional<String> anyName = names.parallel().findAny();

        anyName.ifPresent(System.out::println);

        // Output Sruthi
    }
}
