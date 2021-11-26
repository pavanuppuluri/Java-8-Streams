import java.util.stream.Stream;

public class TerminalOperationCountGte60Marks {
    public static void main(String[] args) {
        Stream<Integer> marksStream = Stream.of(56,66,90,87,70,45);
        long studentsGte60Marks = marksStream.filter(i->i>=60).count();
        System.out.println(studentsGte60Marks);


    }
}
