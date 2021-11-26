import java.util.stream.IntStream;

public class IntStreamRangeClosed {
    public static void main(String[] args) {
        IntStream intStream=IntStream.rangeClosed(1,9);
        intStream.forEach(System.out::println);


    }
}
