import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class TerminalOperationWithReduceOptional {
    public static void main(String[] args) {
        //Empty stream
        Stream<Integer> emptyStream= Stream.of();


        Optional<Integer> sum=emptyStream.reduce(
                                    (a,b)->a+b // Accumulator
                            );
        if(sum.isPresent())
            System.out.println("Sum is "+sum);
        else
            System.out.println("Empty stream");
    }
}
