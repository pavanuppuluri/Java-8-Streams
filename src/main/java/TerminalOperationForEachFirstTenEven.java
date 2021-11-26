import java.util.stream.Stream;

public class TerminalOperationForEachFirstTenEven {
    public static void main(String[] args) {
        // Print first ten even numbers using streams

        Stream<Integer> integerStream=Stream.iterate(1, i->i+1);

        integerStream
                .filter(n->n%2==0)
                .limit(10)
                .forEach(System.out::println);

        // Output 2 4 6 8 10 12 14 16 18 20
    }
}
