import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationFromStreamIterate {

    public static void main(String[] args) {
        Stream.iterate(1,i->i+1).limit(6).forEach(System.out::println);
    }
}
