import java.util.Arrays;
import java.util.List;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("A","B","C");
        strings.stream().forEach(System.out::println);
    }
}
