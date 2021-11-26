import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperationMin {
    public static void main(String[] args) {
        // Find minimum element in a given stream
        List<Integer> integerList = Arrays.asList(100,90,99);

        Optional<Integer> minimumElement = integerList
                .stream()
                // Passing comparator to min
                .min((i1,i2)->i1-i2);

        minimumElement.ifPresent(System.out::println);

        // Output 90
    }
}
