import java.util.Arrays;
import java.util.List;

public class TerminalOperationReduceIdentityAccumulatorCombiner {
    public static void main(String[] args) {


        // Program to greet list of people with Hi
        // Below reduce function starts with default
        // value "Hi " and then concatenates all stream
        // elements to it
        List<String> names = Arrays.asList("C","C++","Java");

        // Approach 1 - Wrong
//        names.stream().reduce(
//                (a,b)->a.length()+b.length()
//        );

        // Approach 2 - Wrong
//        names.stream().reduce(
//                0,
//                (a,b)->a.length()+b.length()
//        );

        // Error int can't be converted to String

        // Approach 3 - Correct
        int length = names.stream()
                .reduce(
                        0,         // identity
                        (a,b)-> a+b.length(), //accumulator
                        (l1,l2)-> l1+l2
                );

//        int length = names.parallelStream()
//                .reduce(
//                        0,         // identity
//                        (a,b)->
//                        {
//                            System.out.println("In Accumulator Method");
//                            return a+b.length();
//                        }, //accumulator
//                        (l1,l2)->
//                        {
//                            System.out.println("In Combiner Method");
//                            return l1+l2;
//                        }
//                );

        System.out.println(length);

        // Output Hi Ram Sam Gopi
    }
}
