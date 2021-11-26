import java.util.stream.Stream;

public class StreamCreationStreamConcat {

    public static void main(String[] args) {
        Stream<String> stream1= Stream.of("Welcome","to");
        Stream<String> stream2=Stream.of("Java","Streams");

        Stream<String> stream = Stream.concat(stream1,stream2);
        stream.forEach(System.out::println);
    }

}
