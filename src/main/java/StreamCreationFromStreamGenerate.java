import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationFromStreamGenerate {
    public static void main(String[] args) {
        Stream.generate(new Random()::nextInt).limit(6).forEach(System.out::println);
    }
}
