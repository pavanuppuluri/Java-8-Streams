import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperaionMinIfPresent {
    public static void main(String[] args) {
        Optional<?> minEmpty = Stream.empty() // Empty stream
                .min((s1, s2) -> 0);

        if(minEmpty.isPresent())
        {
            // Our businss logic
        }
        else
        {
            System.out.println("No minimum element exists");
        }
        // Output No minimum element exists
    }
}
