import java.util.Arrays;

public class TestArrayClass {
    public static void main(String[] args) {
        {
            String[] skills = {"C","Java","AWS"};
            Arrays.stream(skills).forEach(System.out::println);
        }
    }
}
