import java.util.ArrayList;
import java.util.List;

public class CollectionVsStreamStorage
{



    public static void main(String[] args) {

        List<String> skillSet = new ArrayList();
        skillSet.add("C");
        skillSet.add("C++");
        skillSet.add("Java");
        skillSet.add("Java");

        skillSet.stream().distinct().forEach(System.out::println);



    }
}

