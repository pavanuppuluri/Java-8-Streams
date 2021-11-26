import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationCollectorsSummingInt {
    public static void main(String[] args) {
        List<String> skills = Arrays.asList("C++","Java","C", "AWS");

        String resultNoDelimiter = skills
        .stream()
        .collect(Collectors.joining());// No delimiter

        System.out.println(resultNoDelimiter);

        String resultWithDelimiter = skills
                .stream()
                .collect(Collectors.joining(","));// No delimiter

        System.out.println(resultWithDelimiter);

        String resultWithDelimiterPrefixSuffix = skills
                .stream()
                .collect(Collectors.joining(",","My skills are "," etc."));// No delimiter

        System.out.println(resultWithDelimiterPrefixSuffix);
    }
}
