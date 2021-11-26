import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationFindAnyEmptyStream {
    public static void main(String[] args) {
        // Program to get any element from
        // an empty stream
        Stream<String> names= Stream.of(); // Empty stream
        Optional<String> anyName = names.findAny();
        String result=anyName.orElse("No element exists");

        System.out.println(result);
        // Output No element exists
    }
}
