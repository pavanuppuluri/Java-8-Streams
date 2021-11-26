import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;


public class StreamCreationStreamOf {

    public static void main(String[] args) {

//        Stream<String> skillSet = Stream.of("C","C++","Java");
//        skillSet.forEach(System.out::println);

//        Stream<String> nullStream = Stream.of(null);
//        nullStream.forEach(System.out::println);

        /* Code to print all the phone numbers for a given
           Customer
         */

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
