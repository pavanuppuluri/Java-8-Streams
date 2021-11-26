import java.util.stream.Stream;

public class TerminalOperationCountStringLengthThree {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("C","AWS","PHP","Java");
        long stringsWithLengthThree = stringStream.mapToInt(String::length).filter(i->i==3).count();
        System.out.println(stringsWithLengthThree);


    }
}
