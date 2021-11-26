import java.util.regex.Pattern;

public class StreamCreationFromSplitAsStream {
    public static void main(String[] args) {
        String skills="C,C++,Java";
        Pattern.compile(",")
                .splitAsStream(skills)           // returns Stream<String>
                .forEach(System.out::println);
        //Output C C++ Java

    }
}
