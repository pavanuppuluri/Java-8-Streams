import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationFlatMapBasic {

    public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1,2,3);
    List<Integer> list2 = Arrays.asList(4,5,6);
    List<Integer> list3 = Arrays.asList(7,8,9);

    //Stream.of(list1,list2,list3).forEach(System.out::println);

    Stream.of(list1,list2,list3)
            .flatMap(List::stream).forEach(System.out::println);

    }
}
