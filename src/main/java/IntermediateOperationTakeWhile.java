import java.util.stream.Stream;

public class IntermediateOperationTakeWhile {
    public static void main(String[] args) {
        // Ordered input stream
//        Stream<Integer> numbersStream=Stream.of(1,2,3,4,5,6,7,8,9);
//        numbersStream.takeWhile(i->i<5).forEach(System.out::println);
        // Output 1 2 3 4

        // Unordered input stream
//        Stream<Integer> numbersStream= Stream.of(1,2,3,4,5,6,7,8,9,1,3,2);
//        numbersStream.takeWhile(i->i<5).forEach(System.out::println);
        // Output Non-deterministic
        // 1,2,3,4 / 1,3,2 or any other subset with values <5
    }
}
