import java.util.Arrays;
import java.util.List;

public class IntermediateOperationMap {
    public static void main(String[] args) {
        // Program to print square of given numbers using map()
        // We are passing Lambda function as input to map()
        List<Integer> numbersList= Arrays.asList(1,2,3,4,5,6);

        numbersList
                .stream()
                .map(n->n*n)         // n->n*n is Lambda function
                .forEach(System.out::println);

        // Output 1 4 9 16 25 36
    }
}
