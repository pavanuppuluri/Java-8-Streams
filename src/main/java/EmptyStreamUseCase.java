import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EmptyStreamUseCase {



    public static void main(String[] args) {

        Stream<String> orderedItemsHistory = getPreviousOrdersHistory();
        orderedItemsHistory.forEach(System.out::println);

    }

    public static Stream<String> getPreviousOrdersHistory()
    {
        // Case 1 - Customer did some purchases earlier
        //List<String> previousOrders= Arrays.asList("Laptop","Mobile","Webcam");

        // Case 2 - Customer don't have any purchase order
        List<String> previousOrders= Arrays.asList();
        return Optional.ofNullable(previousOrders).map(Collection::stream).orElseGet(Stream::empty);
    }
}

