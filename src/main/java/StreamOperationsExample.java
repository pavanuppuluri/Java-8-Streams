import java.util.Arrays;
import java.util.List;

public class StreamOperationsExample {
    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6);
        numbersList
                .stream()    // stream creation
                .filter(n->n%2==0) // intermediate operation
                .map(n->n*n)       // intermediate operation
                .forEach(System.out::println); // terminal operation
    }
}
