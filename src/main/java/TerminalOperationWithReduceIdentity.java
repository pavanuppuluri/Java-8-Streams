import java.util.stream.Stream;

public class TerminalOperationWithReduceIdentity {
    public static void main(String[] args) {
        //Empty stream
        Stream<Integer> emptyStream= Stream.of();
        int sum=emptyStream.reduce(
                                    0, // Identity
                                    (a,b)->a+b // Accumulator
                            );
        System.out.println(sum);
    }
}
