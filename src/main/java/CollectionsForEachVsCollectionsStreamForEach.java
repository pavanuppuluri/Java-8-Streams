import java.util.Arrays;
import java.util.List;

public class CollectionsForEachVsCollectionsStreamForEach {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Pavan","Sruthi","Lasya");


       // Below code preserves order of
       // List collection
       stringList
               .forEach(System.out::println);

       // Output  Pavan Sruthi Lasya

        // Below code doesn't guarantee order
        // of List collection
        stringList
                .parallelStream()
                 .forEach(System.out::println);

        // Output  Sruthi Lasya Pavan
    }
}
