import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhilevsFilter {
    public static void main(String[] args) {
        // sorted stream
        Stream<Integer> n=Stream.of(1,2,3,4,5,6,7,8,9);
        n.filter(i->
        {
            System.out.println(i);
            return i<5;
        }).collect(Collectors.toList());
// Output 1 2 3 4 5 6 7 8 9


// sorted stream
//        Stream<Integer> n= Stream.of(1,2,3,4,5,6,7,8,9);            n.takeWhile(i->
//        {
//            System.out.println(i);
//            return i<5;
//        }).collect(Collectors.toList());
// Output 1 2 3 4 5
    }
}
