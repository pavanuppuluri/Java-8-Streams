import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperationReduceOnlyAccumulator {
    public static void main(String[] args) {



        List<String> names = Arrays.asList("Ram","Sam","Raj");

        Optional<String> greeting = names.stream()
                .reduce(

                        (a,b)->a+b //accumulator
                );

        greeting.ifPresent(System.out::println);

        // Output Hi Ram Sam Gopi
    }
}
