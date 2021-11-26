import java.util.Arrays;
import java.util.List;

public class IntermediateOperationSorted {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Cat","Ant","Bat");
        stringList
                .stream()
                .sorted()             // Performs sorting
                .forEach(System.out::println);

        // Output Ant Bat Cat


        List<Integer> integerList = Arrays.asList(90,78,81);
        integerList
                .stream()
                .sorted()             // Performs sorting
                .forEach(System.out::println);
    }
}
