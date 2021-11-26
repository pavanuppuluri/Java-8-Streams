import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationFindAny {
    public static void main(String[] args) {

        // Find any element of a given stream
        Stream<String> names=Stream.of("Anand","Sruthi","Uma");
        Optional<String> anyName = names.findAny();
        anyName.ifPresent(System.out::println);

        // Output Anand
    }
}
