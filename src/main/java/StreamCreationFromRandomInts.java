import java.util.Random;

public class StreamCreationFromRandomInts {
    public static void main(String[] args) {

        Random random=new Random();
        random.ints().limit(6).forEach(System.out::println);

        random.doubles().limit(6).forEach(System.out::println);

        random.longs().limit(6).forEach(System.out::println);
    }
}
