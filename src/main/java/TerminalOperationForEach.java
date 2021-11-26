import java.util.stream.Stream;

public class TerminalOperationForEach {
    public static void main(String[] args) {
        // Print elements of a stream using forEach

        Stream<Integer> integerStream= Stream.of(1,2,3,4,5,6);

        integerStream.forEach(System.out::println);

        // Output 1 2 3 4 5 6
    }
}
