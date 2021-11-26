import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationFilter {

    public static void main(String[] args) {

        // Code to collect even numbers from a stream of numbers
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6);
        numbersList
                .stream()
                .filter(i->i%2==0)  // filter condition checking even numbers
                .forEach(System.out::println);

    }







}
