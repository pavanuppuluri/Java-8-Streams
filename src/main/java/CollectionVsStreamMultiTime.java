import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStreamMultiTime {



    public static void main(String[] args) {

        List<String> skillSet = new ArrayList();
        skillSet.add("C");
        skillSet.add("C++");
        skillSet.add("Java");
        skillSet.add("Java");


        for(String skill:skillSet)
            System.out.println(skill);

        for(String skill:skillSet)
            System.out.println(skill);

        Stream<String> skillSetStream=skillSet.stream();

        skillSetStream.distinct().forEach(System.out::println);
        skillSetStream.distinct().forEach(System.out::println);



    }
}

