import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationFindFirstEmptyStream {
    public static void main(String[] args) {
        // Program to get first element from an empty stream
        Stream<String> names= Stream.of(); // Empty stream
        Optional<String> firstName = names.findFirst();
        String result = firstName.orElse("No first element exists");

        System.out.println(result);
        // Output No first element exists

    }
}
