import java.util.ArrayList;
import java.util.List;

public class CollectionVsStreamIteration{



    public static void main(String[] args) {

        List<String> skillSet = new ArrayList();
        skillSet.add("C");
        skillSet.add("C++");
        skillSet.add("Java");
        skillSet.add("Java");

        for(String skill:skillSet)
            System.out.println(skill);

        skillSet.stream().distinct().forEach(System.out::println);



    }
}

