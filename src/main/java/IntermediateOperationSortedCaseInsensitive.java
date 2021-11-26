import java.util.stream.Stream;

public interface IntermediateOperationSortedCaseInsensitive {
    public static void main(String[] args) {
        Stream<String> names1 = Stream.of("Anand","arun","Lasya","Bhavani");
        System.out.println("Case Sensitive Sort ...");
        names1.sorted().forEach(System.out::println);

        Stream<String> names2 = Stream.of("Anand","arun","Lasya","Bhavani");
        System.out.println("Case Inensitive Sort ...");
        names2.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

    }
}
