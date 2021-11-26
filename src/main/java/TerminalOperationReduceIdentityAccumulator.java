import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperationReduceIdentityAccumulator {
    public static void main(String[] args) {


        // Program to greet list of people with Hi
        // Below reduce function starts with default
        // value "Hi " and then concatenates all stream
        // elements to it
        List<String> names = Arrays.asList("Ram","Sam","Raj");

        String greeting = names.stream()
                .reduce(
                        "Hi! ",         // identity
                        (a,b)->a+b //accumulator
                );

        System.out.println(greeting);

        // Output Hi Ram Sam Gopi
    }
}
