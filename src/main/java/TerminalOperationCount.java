import java.util.stream.Stream;

public class TerminalOperationCount {
    public static void main(String[] args) {
        Stream<String> skills = Stream.of("C","C++","Java");
        long skillsCount = skills.count();
        System.out.println(skillsCount);


    }
}
