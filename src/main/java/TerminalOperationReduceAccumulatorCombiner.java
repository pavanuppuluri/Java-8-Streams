import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperationReduceAccumulatorCombiner {
    public static void main(String[] args) {

        List<Integer> ages = Arrays.asList(1,2,3,4,5,6);

        // We are passing accumulator function to reduce()
        // to perform sum of the stream elements
        int totalSum = ages.stream()
                                    .reduce(
                                            10, // identity
                                            (a,b)->a+b //accumulator
                                           );

        System.out.println(totalSum);

        // Output 21
    }
}
