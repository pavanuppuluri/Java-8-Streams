import java.util.OptionalInt;
import java.util.Random;

public class TerminalOperationFindFirstRandomEven {
    public static void main(String[] args) {
        Random random=new Random();
        OptionalInt randomEven = random.ints().filter(i->i%2==0).findFirst();
        randomEven.ifPresent(System.out::println);

        // Output 1872498234
    }
}
