import java.util.stream.Stream;

public class IntermediateOperationPeek {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Pavan", "Anand", "Arun");
        long count = stream
                .filter(s -> s.startsWith("A"))
                .peek(System.out::println) // peek for debugging
                .count(); // Terminal operation

        System.out.println(count);




        // Output Anand Arun 2
    }
}
