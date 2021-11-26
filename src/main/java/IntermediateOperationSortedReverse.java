import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperationSortedReverse {
    public static void main(String[] args) {
        // Sort given strings in reverse order using sorted()
        List<String> stringList = Arrays.asList("C","A","B");
        stringList = Arrays.asList("Cat","Ant","Bat");
        stringList
                .stream()
                .sorted(Comparator.reverseOrder())  // Performs reverse sorting
                .forEach(System.out::println);

        // Output Cat Bat Ant
    }
}
