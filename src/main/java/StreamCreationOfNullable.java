import java.util.HashMap;
import java.util.stream.Stream;

public class StreamCreationOfNullable {
    public static void main(String[] args) {
//        Stream<String> nullStream= Stream.ofNullable(null);
//        nullStream.forEach(System.out::println);
//
//        Stream<String> nullableStream= Stream.ofNullable(null);
//        nullableStream.forEach(System.out::println);

        String[] phoneNumber = getPhoneNumber(3);
        Stream.of(phoneNumber).forEach(System.out::println);

    }

    static String[] getPhoneNumber(int customerId)
    {
        HashMap<Integer,String[]> customerPhoneNumberMap =
                new HashMap<>();
        customerPhoneNumberMap.put(1,new String[]{"123456","666699"});
        customerPhoneNumberMap.put(2,new String[]{"999456","999999","989866"});
        customerPhoneNumberMap.put(3,null);


        return customerPhoneNumberMap.get(customerId);
    }
}
