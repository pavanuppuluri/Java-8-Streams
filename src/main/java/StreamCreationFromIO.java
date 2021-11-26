import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamCreationFromIO {
    public static void main(String[] args) throws IOException {

        try(BufferedReader reader= Files.newBufferedReader(Paths.get("C:\\file.txt"), StandardCharsets.UTF_8))
        {
            reader
            .lines() // returns Stream<String>
            .forEach(System.out::println);
        }
    }
}
