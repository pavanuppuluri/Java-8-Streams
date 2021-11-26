import java.util.Arrays;
import java.util.List;

public class IntermediateOperationDistinct {
    public static void main(String[] args) {

        // Remove duplicate elements and print
        List<String> skillList= Arrays.asList("C","C++","Java","C","Python","Java");

        skillList
                .stream()
                .distinct()         // To remove duplicate elements
                .forEach(System.out::println);

        // Output C C++ Java Python
    }
}
