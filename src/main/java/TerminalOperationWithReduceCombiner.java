import java.util.Arrays;
import java.util.List;

public class TerminalOperationWithReduceCombiner {
    public static void main(String[] args) {

        // Count sum of stream elements using parallel streams

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // We are passing identity, accumulator, combiner
        int sum = numbers.parallelStream()
                                 .reduce(
                                        0,           // identity
                                        (a,b)->a+b,  // accumulator
                                        Integer::sum // combiner
                                        );
        System.out.println(sum);

        // Output 45
    }
}
