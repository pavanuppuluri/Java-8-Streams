import java.util.stream.IntStream;

public class IntStreamRange {
    public static void main(String[] args) {
        IntStream intStream=IntStream.range(1,9);
        intStream.forEach(System.out::println);
    }
}
