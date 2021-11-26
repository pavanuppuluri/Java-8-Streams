import java.util.stream.Stream;

public class StreamConcatOutput {

    public static void main(String[] args) {
        Stream<String> stream1=Stream.of("Welcome","to");
        Stream<String> stream2=Stream.of("Java","Streams");

        Stream<String> concatStream = Stream.concat(stream1,stream2);
        stream1=Stream.of("XYZ");
        concatStream.forEach(System.out::println);
    }
}
