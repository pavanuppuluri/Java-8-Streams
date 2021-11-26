import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationFindFirst {
    public static void main(String[] args) {
        Stream<String> skills=Stream.of("C","C++","Java");
        Optional<String> firstSkill= skills.findFirst();
        firstSkill.ifPresent(System.out::println);
    }
}
