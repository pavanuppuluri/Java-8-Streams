import java.util.Arrays;

public class SimpleArrayStream {
    public static void main(String[] args) {
        {
            String[] skills ={"c","c++","java"};
            Arrays.stream(skills).forEach(System.out::println);
        }
    }
}
