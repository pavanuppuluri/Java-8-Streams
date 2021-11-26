import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class IntermediateOperationFlatMap {
    public static void main(String[] args) {
            List<String> favItems1= Arrays.asList("Dal","Chicken","Rice");
            List<String> favItems2=Arrays.asList("Noodles","Mutton","Rice");
            List<String> favItems3=Arrays.asList("Mushroom","Corn","Roti");

            List<List<String>> finalList = Arrays.asList(favItems1,favItems2,favItems3);
            List<String> uniqueList = finalList
                                        .stream()
                                         .flatMap(s->s.stream())
                                          .distinct().collect(toList());
            System.out.println(uniqueList);
            // Dal, Chicken, Rice, Noodles, Mutton, Mushroom, Corn, Roti
    }
}
