import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperationReduce {
    public static void main(String[] args) {

        List<Integer> ages = Arrays.asList(1,2,3,4,5,6);

        // We are passing accumulator function to reduce()
        // to perform sum of the stream elements
        Optional<Integer> totalSum = ages.stream()
                                    .reduce(
                                            (a,b)->a+b //accumulator
                                           );

        System.out.println(totalSum.get());

        // Output 21
    }
}
