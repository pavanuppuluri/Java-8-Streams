import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationFlatMapUniqueWords {
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("C:\\file.txt"), StandardCharsets.UTF_8);
        Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" ")));
        List<String> uniqueWords = words.distinct().collect(Collectors.toList());
        System.out.println(uniqueWords);

    }
}
